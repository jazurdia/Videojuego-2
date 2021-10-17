public class Warrior extends Hero{

    public Warrior(String nombre, String mensaje, int vida, int attackPoints, int bagSize) {
        super(nombre, mensaje, vida, attackPoints, bagSize);
        //TODO Auto-generated constructor stub
        setterAuto();
    }

    public void setterAuto(){
        this.vida = 20;
        this.attackPoints = 8;
        this.bagSize = 3;
    }

    

}