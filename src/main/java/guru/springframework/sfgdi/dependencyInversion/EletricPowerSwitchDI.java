package guru.springframework.sfgdi.dependencyInversion;

/**
 * Exemple of Dependency Inversion Principle
 */
public class EletricPowerSwitchDI implements Switch {

    public boolean on;

    public Switchable switchable;

    public EletricPowerSwitchDI(Switchable switchable) {
        this.on = false;
        this.switchable = switchable;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            switchable.turnOff();
            this.on = false;
        } else {
            switchable.turnOn();
            this.on = true;
        }
    }
}
