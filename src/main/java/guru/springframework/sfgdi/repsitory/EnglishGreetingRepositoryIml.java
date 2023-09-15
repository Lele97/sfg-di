package guru.springframework.sfgdi.repsitory;

public class EnglishGreetingRepositoryIml implements EnglishGreetingRepository{

    @Override
    public String getGreeting() {
        return "HELLO - WORLD - EN";
    }
}
