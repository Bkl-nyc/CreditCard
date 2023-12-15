package creditSystem;



public class Item {



    private String name;
    private double pricePerUnit;


    public Item(String name, double pricePerUnit) {

        this.name = name;
        this.pricePerUnit = pricePerUnit;
        System.out.println( name + " item has been created which has the price $" + pricePerUnit );



    }
    public String GetName(){
        return this.name = name;
    }

    public double GetCost() {
        return this.pricePerUnit = pricePerUnit;
    }

}

