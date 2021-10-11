import java.util.*;
public abstract class Hero extends Fighter {

    ArrayList<Item> bagOfItems = new ArrayList<Item>();

    public Hero(String nombre, String mensaje, int vida, int attackPoints) {
        super(nombre, mensaje, vida, attackPoints);
        //TODO Auto-generated constructor stub
    }

    public void addItemToBag(){ // añade un item a la lista de items. 
        bagOfItems.add(new Item()); // Llamar un método para poner los parámetros. 
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
