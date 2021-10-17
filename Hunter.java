import java.util.ArrayList;

public class Hunter extends Hero {

    ArrayList <Pet> pets = new ArrayList<Pet>();

    public Hunter(String nombre, String mensaje) {
        super(nombre, mensaje);
        //TODO Auto-generated constructor stub

        this.vida = 5;
        this.attackPoints = 3;
        this.bagSize = 2;
    }    

    public void addPetToPets(Pet pet){
        pets.add(pet);
    }

    public Pet launchPet(){
        return pets.get(0);
    }

    
    
}
