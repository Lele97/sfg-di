package guru.springframework.sfgdi.dependencyInversion;

/**
 * The mistake is apparent the high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb class.
 */
public class ElectircPowerSwitch {

    public LightBulb lightBulb;

    public Fan fan;

    public boolean on;

    public ElectircPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public ElectircPowerSwitch(Fan fan) {
        this.fan = fan;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void pressBulb() {
        boolean checkOn = isOn();

        if (checkOn) {
            lightBulb.turnOFF();
            this.on = false;
        } else {
            lightBulb.turnON();
            this.on = true;
        }
    }

    public  void pressFan(){
        boolean checkOn = isOn();

        if (checkOn) {
            fan.turnOFF();
            this.on = false;
        } else {
            fan.turnON();
            this.on = true;
        }
    }
}
