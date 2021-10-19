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
        Random rand = new Random();
        int numOfBosses = rand.nextInt(2)+1;
        for(int i = 0; i< numOfBosses; i++);
        
    }

    public void addEnemyRandom(){
        Random rand = new Random();
        switch (rand.nextInt(2)+1) {
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

    // doesnt work. 
    public void isAttacking(Hero attacking, ArrayList<Enemy> list){
        int index = vista.whoGetsAttacked();

        switch (vista.menuAttacking()) {
            case 1: // standart damage
                list.get(index).takingDamage(attacking.getAttackPoints());
                break;
        
            case 2: // item damage
                list.get(index).takingDamage(attacking.useItem());
                break;
        }

    }

    public void isAttacking(Enemy attacking, ArrayList<Fighter> list){
        Random rand = new Random();
        int index = rand.nextInt(list.size()-1);
        if(index <= 0 ){
            index = 0;
        } 
        int desicion = rand.nextInt(1);
        switch (desicion) {
            case 0: // standart damage
                list.get(index).takingDamage(attacking.getAttackPoints());
                break;
        
            case 1:
                list.get(index).takingDamage(attacking.getExtraDamage());
                break;
        }

    }

    public void addBossRandom(){
        Random rand = new Random();
        int numOfBosses = rand.nextInt(2)+1;
        for(int i = 0; i<numOfBosses; i++){
            switch (rand.nextInt(1)+1) {
                case 1: // TrollBOss
                    enemies.add(new BossTroll());
                    break;
                
                case 2:
                    enemies.add(new BossDwarf());
                    break;
                
                case 3:
                    enemies.add(new BossOrc());
                    break;
            }
        }
        
    }


    public void match(){ // método que ejecutará el main. 
        
        // setting all the actors in the match. 
        settingPlayers();
        settingEnemies(vista.askingNumEnemies());
        addBossRandom();
        enemies.add(new RaidBoss());
        
        
        // Begin of the match.
        vista.show("*****************************************************************");
        boolean stop = false;
        while(stop == false){

            for(int turno = 0; turno <players.size(); turno ++){
                vista.turnOfHero(turno, players);
                vista.listOfEnemies(enemies);
                int whoIsAttacked = vista.whoGetsAttacked();
                if(whoIsAttacked < enemies.size()){
                    switch (vista.menuAttacking()){
                        case 1: // standart damage
                            enemies.get(whoIsAttacked).takingDamage(players.get(turno).getAttackPoints());
                            vista.showLifeEnemies(enemies, whoIsAttacked);
                            if(enemies.get(whoIsAttacked).getLife() <= 0){
                                enemies.remove(whoIsAttacked);
                            }
                            break;
                    
                        case 2: // item damage
                            enemies.get(whoIsAttacked).takingDamage(players.get(turno).useItem());
                            vista.showLifeEnemies(enemies, whoIsAttacked);
                            if(players.get(whoIsAttacked).getLife() <= 0){
                                players.remove(whoIsAttacked);
                            }
                            break;
                    }
                
                }else{
                    vista.cagaste();
                }   

            }

            for(int turno = 0; turno < enemies.size(); turno ++){
                Random rand = new Random();
                
                int whoHeroIsAttacked = rand.nextInt(players.size());
                
                






            }



        }

    }

}
