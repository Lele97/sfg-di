package guru.springframework.sfgdi.dependencyInversion;

/**
 * Exemple of Dependency Inversion Principle
 */
public class LightBulbDI implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("## LightBulb: turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("## LightBulb: turned off...");
    }
}
