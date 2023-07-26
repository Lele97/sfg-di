package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingServices greetingServices;

    @Autowired
    public void setGreetingServices(GreetingServices greetingServices) {
        this.greetingServices = greetingServices;
    }

    public GreetingServices getGreetingServices() {
        return greetingServices;
    }

    public String getGreeting(){
        return greetingServices.sayGreeting();
    }
}
