import java.util.ArrayList;
import java.util.Random;

public class Hunter extends Hero {
    Vista vista = new Vista();
    boolean activePet = false;
    Pet pet;

    public Hunter(String nombre, String mensaje) {
        super(nombre, mensaje);
        //TODO Auto-generated constructor stub

        this.vida = 5;
        this.attackPoints = 3;
        this.bagSize = 2;
        addPetToPets();

    }    

    public void addPetToPets(){
        Random rand = new Random();
        switch (rand.nextInt(1)) {
            case 0:
                pet = new PetBird();
                break;
        
            case 1:
                pet = new PetDog();
                break;
        }
        vista.tellPet(name, pet.getName());

    }


    @Override
    public int getAttackPoints(){
        if(activePet == true){
            attackPoints = attackPoints + pet.getAttackPoints();
        }else{
            if(pet.getCoolDown() <= 0){
                this.activePet = true;

            }else{
                this.attackPoints = 3;
            }
        }
        
        return attackPoints;
    }

    
    
}
