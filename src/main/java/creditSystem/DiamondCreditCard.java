package creditSystem;

import java.util.*;
public class DiamondCreditCard {


    private String account;
    public int id;

    List <Item> list = null;
    int num;


    public DiamondCreditCard(String account) {

        this.account = account;
        list = new ArrayList<Item>();
        this.num = 0;
        System.out.println("A diamond credit card account is made with the name " + account);


    }
        public void add(Item purchase) {
            list.add(purchase);
            System.out.println(account + " purchased " + purchase.GetName());


    }
        public String purchasedItem() {
            return "Item [list=" + list + ", num=" + num + "]";


    }


}







