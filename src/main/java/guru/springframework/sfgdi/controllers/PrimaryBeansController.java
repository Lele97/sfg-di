package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeansController {

    @Autowired
    private GreetingServices greetingServices;

    public String getGreeting() {
        return greetingServices.sayGreeting();
    }

}
