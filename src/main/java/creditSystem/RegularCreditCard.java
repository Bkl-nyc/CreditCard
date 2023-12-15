package creditSystem;

import java.util.ArrayList;
import java.util.List;

public class RegularCreditCard {

    private String account;
    public int id;
    List<Item> list = null;
    int num;



    public  RegularCreditCard(String account) {

        this.account = account;
        list = new ArrayList<Item>();
        this.num = 0;

        System.out.println("A regular credit card account is made with the name " + account);


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
        return totalcost;
    }

    public String toString() {
        String t = null;
        for(int i = 0; i < list.size(); i++){
            t = list.get(i).getName();
        }
        return "[" + t + "]";
    }
}
//        public purchasedItem() {
//            String x = null;
//            for(int i = 0; i < list.size(); i++){
//            x = list.get(i).GetName();
//            }
//            return x;
//
//    }
//}

