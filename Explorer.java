public class Explorer extends Hero {

    public Explorer(String nombre, String mensaje, int vida, int attackPoints, int bagSize) {
        super(nombre, mensaje, vida, attackPoints, bagSize);
        //TODO Auto-generated constructor stub
        setterAuto();
    }
    
    public void setterAuto(){
        this.vida = 10;
        this.attackPoints = 5;
        this.bagSize = 5;
    }
}
