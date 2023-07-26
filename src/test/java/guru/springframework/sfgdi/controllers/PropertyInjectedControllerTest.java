package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingServices = new GreetingServicesImpl();
    }

    @Test
    void greeting(){
        System.out.println(controller.getGreeting());
    }
}
