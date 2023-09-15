package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repsitory.EnglishGreetingRepository;

public class I18nEnglishService implements GreetingServices{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return englishGreetingRepository.getGreeting();
    }
}
