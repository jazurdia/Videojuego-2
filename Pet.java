public class Pet extends Fighter{

    int coolDown;

    public Pet(String name, String message) {
        super(name, message);
        //TODO Auto-generated constructor stub

        this.vida = 5;
        this.coolDown = 0;

    }

    public Pet(){ // CONSTRUCTOR ALTERNATIVO

    }

    @Override
    public void takingDamage(int damage){
        this.vida = vida - damage;
        
    }
    
    public void reGenerate(){
        this.vida = 5;
    }

    public void autoSetCoolDown(){
        this.coolDown = 3;
    }
    
    public void resCoolDown(){
        this.coolDown = coolDown - 1;
        if(coolDown <= 0){
            reGenerate();
        }
    }
   
}