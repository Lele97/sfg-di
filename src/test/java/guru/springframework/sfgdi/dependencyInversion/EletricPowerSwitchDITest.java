package guru.springframework.sfgdi.dependencyInversion;

import org.junit.jupiter.api.Test;

class EletricPowerSwitchDITest {

    @Test
    public void testPress() throws Exception {
        Switchable switchable = new LightBulbDI();
        Switch switcH = new EletricPowerSwitchDI(switchable);
        switcH.press();
        switcH.press();

        switchable = new FanDI();
        switcH = new EletricPowerSwitchDI(switchable);
        switcH.press();
        switcH.press();
    }

}