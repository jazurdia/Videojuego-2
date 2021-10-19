import java.util.*;
public abstract class Hero extends Fighter {

    int bagSize;
    ArrayList<Item> bagOfItems = new ArrayList<Item>();

    public Hero(String nombre, String mensaje) {
        super(nombre, mensaje);
        
    }

    public void addItemToBag(int num){
        if(bagOfItems.size()<=bagSize){  
            switch (num) {
                case 1: // orbe de curación
                    bagOfItems.add(new ItemHeal());
                    break;
            
                case 2: // orbe de daño
                    bagOfItems.add(new ItemDamage());
                    break;
                
                case 3: // Bomba nuclear
                    bagOfItems .add(new ItemBomb());
                    break;
            }
            //Mensaje de "se añadió el item."
        }else{
            //mensaje de "its full."
        }
    }

    public int getBagSize(){
        return bagSize;
    }

    public int useItem(){
        int effectOfItem = bagOfItems.get(0).getEffect();
        bagOfItems.remove(0);
        return effectOfItem;
    }

    
    
}
