public abstract class Fighter {
    int vida;
    int attackPoints;
    
    String name;
    String message;

    public Fighter(String name, String message){
        this.name = name;
        this.message = message;
    }

    public Fighter() {
    }

    public void takingDamage(int damage){
        this.vida = vida - damage;
    }

    public int getAttackPoints(){
        return attackPoints;
    }

    public String getName(){
        return name;
    }

    public int getLife(){
        return vida;
    }




    
}
