public class Pet extends Actor{

    public Pet(String nombre, String mensaje, int vida) {
        super(nombre, mensaje, vida);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void takingDamage(int damage) {
        this.vida = vida-damage;
        
    }
    
}