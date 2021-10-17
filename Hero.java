import java.util.*;
public abstract class Hero extends Fighter {

    int bagSize;
    ArrayList<Item> bagOfItems = new ArrayList<Item>();

    public Hero(String nombre, String mensaje, int vida, int attackPoints, int bagSize) {
        super(nombre, mensaje, vida, attackPoints);
        this.bagSize=bagSize;
    }

    public void addItemToBag(Item item){
        if(bagOfItems.size()<=bagSize){
            bagOfItems.add(item);
            //Mensaje de "se añadió el item."
        }else{
            //mensaje de "its full."
        }
    }
    

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
