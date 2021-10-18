import java.util.*;
public class Boss extends Enemy{

    public Boss(){
        super();
        //TODO Auto-generated constructor stub
    }

    // La habilidad espacial del boss normal es curarse a si mísmo. 
    public void specialAbility(){ // healing
        Random random = new Random();
        this.vida = vida + random.nextInt(10);
    }
    
}
