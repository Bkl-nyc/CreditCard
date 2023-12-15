package creditSystem;

import java.util.ArrayList;
import java.util.List;

public class RegularCreditCard {

    private String account;
    public int id;
    List<Item> list = null;
    int num;



    public RegularCreditCard(String account) {

        this.account = account;
        list = new ArrayList<Item>();
        this.num = 0;
        this.id = 2;

        System.out.println("A regular credit card account is made with the name " + account);


    }
        public void add(Item purchase) {
            list.add(purchase);
            System.out.println(account + " purchased " + purchase.GetName());


    }
        public String purchasedItem(Item) {
            account
            return list.GetName();


    }
}

