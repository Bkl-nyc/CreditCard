package creditSystem;



public class Item {



    public String name;
    private double pricePerUnit;


    public Item(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;

        System.out.println( name + " item has been created which has the price $" + pricePerUnit );



    }
    public String getName(){
        return this.name = name;
    }

    public double getCost() {
        return this.pricePerUnit = pricePerUnit;
    }

}

