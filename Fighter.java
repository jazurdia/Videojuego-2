public abstract class Fighter extends Actor {

    int attackPoints;

    public Fighter(String nombre, String mensaje, int vida, int attackPoints) {
        super(nombre, mensaje, vida);
        this.attackPoints = attackPoints;
    }

    @Override
    public void takingDamage(int damage) { // setter de vida. 
        vida = vida - damage;
    }

    public int attack(){ // getter de puntos de ataque.
        return attackPoints;
    }
    
}
