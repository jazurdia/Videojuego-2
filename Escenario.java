import java.util.ArrayList;

public class Escenario {
    Vista vista = new Vista();
    ArrayList<Hero> players = new ArrayList<Hero>();

    public void settingPlayers(){
        boolean stop = false;
        do {
            int typeOfCharacter = vista.settingCharacter();
            switch (typeOfCharacter) {
            
                case 1:
                    players.add(new Warrior(vista.namingCharacter(), vista.messageOfCharacter()));
                    break;
            
                case 2:
                    players.add(new Explorer(vista.namingCharacter(), vista.messageOfCharacter()));
                    break;
    
                case 3: 
                    players.add(new Hunter(vista.namingCharacter(), vista.messageOfCharacter()));
                    break;
                
                case 4:
                    stop = true;
                    break;
            }

        }
        
        while(stop != true);

    }

    

    public void match(){ // método que ejecutará el main. 
        settingPlayers();
    }
}
