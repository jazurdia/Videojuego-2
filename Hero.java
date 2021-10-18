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
    
    // Pero, si se usa de uno en uno, entonces que? REVISAR 
    public void remItemFromBag(String itemName){ // elimina un item de la lista. 
        for(int i = 0; i<bagOfItems.size(); i++){
            if(itemName == bagOfItems.get(i).getName()){
                bagOfItems.remove(i);
            } else{
                //mensaje de "no se pudo"
            }
        }
    }

    
    
}
