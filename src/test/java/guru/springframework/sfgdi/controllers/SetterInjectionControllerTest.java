package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServicesImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectionControllerTest {

    SetterInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectionController();
        controller.setGreetingServices(new GreetingServicesImpl());
    }

    @Test
    void getGreetingServices() {
        System.out.println(controller.getGreeting());
    }
}