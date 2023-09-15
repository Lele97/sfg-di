package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creatting a Singleton Bean...!!!");
    }

    public String getMessage(){
        return "I'm a Singleton";
    }
}
