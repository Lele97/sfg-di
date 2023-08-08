package guru.springframework.sfgdi.dependencyInversion;

/**
 * Dependency Inversion Principle Violation (Bad Example)
 */
public class Fan {
    public void turnON() {
        System.out.println("## Fan: turned on...");
    }

    public void turnOFF() {
        System.out.println("## Fan: turned off...");
    }
}
