import java.util.ArrayList;
import java.util.Random;

public class RaidBoss extends Boss{
    boolean hasClones;
    ArrayList <RaidBossCopy> clones = new ArrayList<RaidBossCopy>();
    
    public RaidBoss(){
        this.name = "Principe Marciano";
        this.message = "Al final, todo será mio!";
        this.vida = 100;
        this.attackPoints = 15;
        this.extradamage = 8;
        this.nameOfAbility = "Cañón destructor de mentes" ;
        this.hasClones = false;
    }

    public void cloningItself(){
        
        if(hasClones == false){
            Random rand = new Random();
            int doOrNot = rand.nextInt(100);
            if(doOrNot < 20){
                for (int i = 0; i< rand.nextInt(3); i++){
                    clones.add(new RaidBossCopy());
                    System.out.println("Se han hecho " + i + " copias de " + name);
                    this.hasClones = true;
                    
                }
            }else if(doOrNot > 80){
                clones.clear();
                System.out.println("Se han eliminado todas las copias de " + name);
                this.hasClones = false;
            }
        }

    }

    @Override
    public void takingDamage(int damage){
        this.vida = vida - damage;
        cloningItself();
        for(int i = 0; i<clones.size(); i++){
            clones.get(i).takingDamage(damage);
        }
    }

    @Override
    public int getAttackPoints(){
        
        if(hasClones == true){
            for(int i = 0; i<clones.size(); i++){
                attackPoints = attackPoints + clones.get(i).getAttackPoints();
            }
        }else{
            attackPoints = 20;
        }
        
        return attackPoints;
    }

}
