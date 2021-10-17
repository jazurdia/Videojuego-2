public abstract class Fighter {
    int vida;
    int attackPoints;
    
    String name;
    String message;

    public Fighter(String name, String message){
        this.name = name;
        this.message = message;
    }

    public void takingDamage(int damage){
        this.vida = vida - damage;
    }

    public int getAttackPoints(){
        return attackPoints;
    }




    
}
