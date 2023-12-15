package creditSystem;

import java.util.*;
public class DiamondCreditCard {


    public String account;
    public int id;

    List<Item> list = null;
    ArrayList purchasedItem = new ArrayList();


    public DiamondCreditCard(String account) {

        this.account = account;
        list = new ArrayList<Item>();

        System.out.println("A diamond credit card account is made with the name " + account);


    }

        public void add(Item purchase) {
            list.add(purchase);
            System.out.println(account + " purchased " + purchase.getName());
        }

    public double rewardPoints() {

        double totalcost = 0;
        for (int i = 0; i < list.size(); i++) {
            totalcost += list.get(i).getCost();

        }
        return totalcost * 3;
    }
    public ArrayList<String> purchasedItems() {

        for(int i = 0; i < list.size(); i++){
             purchasedItem.add(list.get(i).getName());
            }

            return purchasedItem;
    }
}





//        public void toArray(Item purchase){
//            Object[] obj = list.toArray(purchase);
//            for (Object value : obj) {
//                System.out.println("Color = " + value);
//            }
//
//
//        }
//        public String purchasedItem() {
//            return "Item [list=" + list + ", num=" + num + "]";
//
//
//    }
//}
//        public String purchaseItem(Item) {
//            String x = null;
//            for (Item item : list) {
//                x = String.valueOf(item);
//            }
//            return x;
//}

    /// Add this function as toString class
//    public double rewardPoints() {
//        double totalcost = 0;
//        for(int i = 0; i < list.size(); i++){
//            totalcost += list.get(i).getCost();
//        }
//
//        return totalcost * 3;
//    }
// Returns the total sum cost of all grocery item orders in this list.

//    @Override
//    public String toString() {
//        return "GroceryList [list=" + list + ", num=" + num + "]";
//    }


    /// Add this function as toString class










