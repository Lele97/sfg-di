package guru.springframework.pets;

public class PandaPetService implements PetService{
    @Override
    public String getPetType() {
        return "Il Panda non fa un cazzo tutto il giorno";
    }
}
