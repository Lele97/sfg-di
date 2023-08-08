package guru.springframework.sfgdi.dependencyInversion;

import org.junit.jupiter.api.Test;

class ElectircPowerSwitchTest {
    @Test
    public void testPress() throws Exception {
        LightBulb lightBulb = new LightBulb();
        ElectircPowerSwitch electircPowerSwitch = new ElectircPowerSwitch(lightBulb);
        electircPowerSwitch.pressBulb();
        electircPowerSwitch.pressBulb();

        Fan fan = new Fan();
        electircPowerSwitch = new ElectircPowerSwitch(fan);
        electircPowerSwitch.pressFan();
        electircPowerSwitch.pressFan();
    }
}