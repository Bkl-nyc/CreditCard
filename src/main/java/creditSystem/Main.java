package creditSystem;


public class Main {



    public static void main(String[] args) {



        Item banana = new Item("banana", 2);
        Item apple = new Item("apple", 1);
        Item gold = new Item("gold",50);
        Item car = new Item("car",2000);
        Item xbox = new Item("xbox", 250);


        RegularCreditCard avi = new RegularCreditCard("Avi ");
        DiamondCreditCard jay = new DiamondCreditCard("Jay ");
        DiamondCreditCard bishu = new DiamondCreditCard("Bishu ");

        avi.add(banana);
        avi.add(apple);
        jay.add(gold);
        bishu.add(car);
        bishu.add(xbox);

        System.out.println(bishu.rewardPoints());
        System.out.println(avi.rewardPoints());
        System.out.println(jay.rewardPoints());

        System.out.println(bishu.purchasedItems());



//        System.out.println(bishu.toString());
//        System.out.println(avi.toString());
//        System.out.println(jay.toString());



    }
}

