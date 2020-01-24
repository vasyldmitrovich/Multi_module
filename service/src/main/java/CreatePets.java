public class CreatePets {
    /*A class where I created first pets and have only one method which give string info about this pet*/
    private String infoAboutPets;

    public CreatePets(){}

    public CreatePets(String infoAboutPets) {
        this.infoAboutPets = infoAboutPets;
    }

    public String getInfoAboutPets() {
        return infoAboutPets;
    }

    public void setInfoAboutPets(String infoAboutPets) {
        this.infoAboutPets = infoAboutPets;
    }

    public void  showPets(){
        Pets pets = new Pets("Bysya",2,"Picines");
        String stringPest = "This is name: "+pets.getName()+" This is age: "+pets.getAge()+" This is breed"+pets.getBreed();
        this.infoAboutPets = stringPest;
    }
}
