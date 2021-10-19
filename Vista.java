import java.util.*;
public class Vista {
    

    public void denuevo(){
        System.out.println("Intenta de nuevo!");
    }

    public void show(String string){
        System.out.println(string);
    }
    
    public int menu(String nom_turno)throws InputMismatchException{
        int menu = 0;
        Scanner in = new Scanner(System.in);

        boolean stop = false;
        
        while (stop == false){
            show("1. Atacar");
            show("2. Pasar");

            try {
                menu = in.nextInt();
                stop = true;
            } catch (InputMismatchException e) {
                in = new Scanner(System.in);
                show("Intenta de nuevo");
            }

        }
        in.close();
        return menu;
    }

    public int settingCharacter(){
        
        boolean stop = false;
        int character_type = 0; 
        Scanner in = new Scanner(System.in);

        while(stop == false){
            show("\nLas siguientes son las clases de personajes que puedes ser: ");
            show("\t1. Warrior:  Mucha vida, mucho ataque, pocos items. ");
            show("\t2. Explorer: Vida normal, ataque standart, MUCHOS items. ");
            show("\t3. Hunter:   Poca vida, mínimo ataque, mascota e items. ");
            show("Ingresa 4 cuando hayas terminado de elegir los personajes.\n ");

            try {
                character_type = in.nextInt();
                stop = true;

            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
                
            }
        }

        return character_type;

    }

    public String namingCharacter(){
        boolean stop = false;
        String namingCharacter = "";
        Scanner in = new Scanner(System.in);

        while(stop == false){
            show("Escribe el nombre de tu personaje");
            try {
                namingCharacter = in.nextLine();
                stop = true;
            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
            }
        }

        return namingCharacter;

    }

    public String messageOfCharacter(){
        boolean stop = false;
        String messageOfCharacter = "";
        Scanner in = new Scanner(System.in);

        while(stop == false){
            show("Escribe el mensaje que dará tu personaje al morir o ganar. ");
            try {
                messageOfCharacter = in.nextLine();
                stop = true;
            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
            }
        }

        return messageOfCharacter;

    }
    
    public int askingNumEnemies(){
        
        boolean stop = false;
        int num = 0;
        Scanner in = new Scanner(System.in);

        while(stop == false){
            show("Elige el número de enemigos regulares que tendrá el escenario. ");
            try {
                num = in.nextInt();
                stop = true;
            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
            }

        }
        return num;        
    }

    public int selectingItems(){
        int num = 0;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        while (stop == false){
            show("Elige el item que quieras añadir a tu inventario.");
            show("1. Item de curación");
            show("2. Item de daño pequeño");
            show("3. Item de gran daño");
            try {
                num = in.nextInt();
                stop = true;
            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
            }
        }
        return num;
    }

    public int menuAttacking(){
        int menu = 0;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        while(stop == false){
            show("Selecciona tu accion.");
            show("1. Atacar");
            show("2. Usar orbe");
            show("3. Pasar");
            try {
                menu = in.nextInt();
                stop = true;
            } catch (Exception e) {
                in = new Scanner(System.in);
                denuevo();
            }
        }
        return menu;
    }

    public void listOfHeroes(ArrayList<Hero> list){
        show("************* PLAYERS *************");
        for(int i=0; i<list.size() ; i++){
            show("no. " + i + " - " + list.get(i).getName());
        }
        
    }

    public void listOfEnemies(ArrayList<Enemy> list){
        show("************* ENEMIES *************");
        for(int i=0; i<list.size() ; i++){
            show("no. " + i + " - " + list.get(i).getName());
        }
    }

    public void turnOfHero(int index, ArrayList<Hero> list){
        show("\nEs turno de " + list.get(index).getName() + " ." );
    }

    public int whoGetsAttacked(){
        int index = 0;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        while (stop == false){
            show("Ingresa el número de quien quieras atacar. ");
            try {
                index = in.nextInt();
                stop = true;
            } catch (Exception e) {
                in = new Scanner (System.in);
                denuevo();
            }
        }
        return index;
    }

    public void showLifeEnemies(ArrayList<Enemy> list, int index){
        show("La vida de " + list.get(index).getName() + " es de " + list.get(index).getLife());
    }

    public int whoCategoryIsAttacked(){
        int whoCategoryIsAttacked = 0;
        boolean stop = false;
        Scanner in = new Scanner(System.in);
        while (stop == false){
            show("1. Enemigos Normales");
            show("2. Enemigos Bosses");
            show("3. RaidBoss");
            try {
                whoCategoryIsAttacked = in.nextInt();
                stop = true;
            } catch (Exception e) {
                in = new Scanner (System.in);
                denuevo();
            }
        }
        return whoCategoryIsAttacked;
    }
    
    


}
