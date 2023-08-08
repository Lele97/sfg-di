package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary//per dare maggiore preferenza a un bean quando ci sono più bean dello stesso tipo.
@Service
public class PrimaryGreetingService implements GreetingServices{
    @Override
    public String sayGreeting() {
        return "Hello World - From the primary bean";
    }
}
