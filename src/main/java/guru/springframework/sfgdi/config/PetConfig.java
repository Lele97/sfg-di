package guru.springframework.sfgdi.config;

import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@ImportResource(locations = "classpath:pets-config.xml")
@Configuration
public class PetConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean("pet")
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean("pet")
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Profile("panda")
    @Bean("pet")
    PetService pandaPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("panda");
    }
}
