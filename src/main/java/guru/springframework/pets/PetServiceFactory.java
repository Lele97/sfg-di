package guru.springframework.pets;

public class PetServiceFactory {

    public PetService getPetService(String petType) {
        System.out.println("## [ PetServiceFactory ] :: petType = " + petType);
        switch (petType) {
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }
}
