public abstract class Enemy extends Fighter {

    int extradamage;
    String nameOfAbility;

    public Enemy(String nombre, String mensaje, int vida, int attackPoints, String nameOfAbility,  int extradamage) {
        super(nombre, mensaje, vida, attackPoints);
        this.extradamage = extradamage;
        this.nameOfAbility = nameOfAbility;
    }

    public int useAbility(){
        // Método para mostrar un mensaje de "x wey usó x habilidad. "
        return extradamage;
    }


    
}
