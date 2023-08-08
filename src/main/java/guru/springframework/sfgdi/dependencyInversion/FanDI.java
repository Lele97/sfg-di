package guru.springframework.sfgdi.dependencyInversion;

/**
 * Exemple of Dependency Inversion Principle
 */
public class FanDI implements  Switchable{
    @Override
    public void turnOn() {
        System.out.println("## Fan: turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("## Fan: turned off...");
    }
}
