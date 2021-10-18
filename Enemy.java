public abstract class Enemy extends Fighter {

    int extradamage;
    String nameOfAbility;
    
    
    public Enemy(String name, String message) {
        super();
        //TODO Auto-generated constructor stub
    }


    public Enemy() {
    }


    public int useAbility(){
        // Método para mostrar un mensaje de "x wey usó x habilidad. "
        return extradamage;
    }

    
}
