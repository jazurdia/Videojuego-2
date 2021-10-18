public abstract class Enemy extends Fighter {

    int extradamage;
    String nameOfAbility;
    
    public Enemy(String name, String message) {
        super(name, message);
        //TODO Auto-generated constructor stub
    }


    public int useAbility(){
        // Método para mostrar un mensaje de "x wey usó x habilidad. "
        return extradamage;
    }

    
}
