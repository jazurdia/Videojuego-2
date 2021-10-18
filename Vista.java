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
    


    
    


}
