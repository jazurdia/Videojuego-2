public class Item {
    String name;
    int effect; // daño causado.

    Item(String name, int effect){
        this.name = name;
        this.effect = effect;
    }

    public Item() {
    }

    public String getName(){
        return name;
    }



    
}
