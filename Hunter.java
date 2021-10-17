import java.util.ArrayList;

public class Hunter extends Hero {

    ArrayList <Pet> pets = new ArrayList<Pet>();
    
    
    public Hunter(String nombre, String mensaje, int vida, int attackPoints, int bagSize) {
        super(nombre, mensaje, vida, attackPoints, bagSize);
        //TODO Auto-generated constructor stub
    }

    public void setterAuto(){
        this.vida = 5;
        this.attackPoints = 3;
        this.bagSize = 4;
    }

    public void addPetToPets(Pet pet){
        pets.add(pet);
    }

    public Pet launchPet(){
        return pets.get(0);
    }

    
    
}
