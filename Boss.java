import java.util.*;
public class Boss extends Enemy{

    public Boss(){
        super();
        //TODO Auto-generated constructor stub
    }

    public void specialAbility(){ // healing
        Random random = new Random();
        this.vida = vida + random.nextInt(10);
    }
    
}
