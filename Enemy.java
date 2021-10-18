public abstract class Enemy extends Fighter {

    int extradamage;
    String nameOfAbility;

    public Enemy() {
    }


    public int useAbility(){
        // Método para mostrar un mensaje de "x wey usó x habilidad. "
        return extradamage;
    }

    
}
