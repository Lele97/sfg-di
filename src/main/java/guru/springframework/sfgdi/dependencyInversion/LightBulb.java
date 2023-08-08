package guru.springframework.sfgdi.dependencyInversion;

/**
 * Dependency Inversion Principle Violation (Bad Example)
 */
public class LightBulb {

    public void turnON(){
        System.out.println("## LightBulb: Bulb turned on...");
    }
    public void turnOFF(){
        System.out.println("## LightBulb: Bulb turned off...");
    }

}
