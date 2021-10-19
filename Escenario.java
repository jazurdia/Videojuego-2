import java.util.ArrayList;
import java.util.Random;

public class Escenario {
    Vista vista = new Vista();
    ArrayList<Hero> players = new ArrayList<Hero>(); 
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    ArrayList<String> turns = new ArrayList<String>();

    //El usuario decide la cantidad de heroes que habrá en la partida. 
    public void settingPlayers(){
        boolean stop = false;
        do {
            int typeOfCharacter = vista.settingCharacter();
            switch (typeOfCharacter) {
            
                case 1:
                    players.add(new Warrior(vista.namingCharacter(), vista.messageOfCharacter()));                    
                    iteratingAdddingItemsToBag(3);
                    break;
            
                case 2:
                    players.add(new Explorer(vista.namingCharacter(), vista.messageOfCharacter()));
                    iteratingAdddingItemsToBag(6);
                    break;
    
                case 3: 
                    players.add(new Hunter(vista.namingCharacter(), vista.messageOfCharacter()));
                    iteratingAdddingItemsToBag(2);
                    break;
                
                case 4:
                    stop = true;
                    break;
            }

        }
        
        while(stop != true);

    }

    //El programa decide la cantidad de enemigos y enemigos jefes que deberán haber. 
    public void settingEnemies(int num){
        
        for(int i=0; i<= num; i++){
            addEnemyRandom();
        }
        
    }

    public void addEnemyRandom(){
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 1: // Troll
                enemies.add(new Troll());
                break;
            
            case 2:
                enemies.add(new Dwarf());
                break;
            
            case 3:
                enemies.add(new Orc());
                break;
        }
    }

    public void iteratingAdddingItemsToBag(int num){
        for(int i=0;i< num ;i++){
            players.get(players.size()-1).addItemToBag(vista.selectingItems());
        }
    }

    public void isAttacking(Fighter attacking, ArrayList<Fighter> list, int index){
        list.get(index).takingDamage(attacking.getAttackPoints());
    }

    



    public void match(){ // método que ejecutará el main. 
        settingPlayers();
        settingEnemies(vista.askingNumEnemies());

        // sección del menu.
        boolean stop = false;
        while(stop == false){

        } 
    }
}
