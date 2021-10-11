public abstract class Actor{
    String nombre;
    String mensaje;
    int vida;

    public Actor(String nombre, String mensaje, int vida){
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.vida = vida;
    }
    
    public abstract void takingDamage(int damage);
    
}