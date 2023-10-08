package acadmey.learnprogramming;

import java.util.ArrayList;

public class Items {
   private String item;
   private double itemPrice;

    public Items(String item, double itemPrice) {
        this.item = item;
        this.itemPrice = itemPrice;
    }

    public String getItem() {
        return item;
    }

    public double getItemPrice() {
        return itemPrice;
    }


    @Override
    public String toString() {
        return
                " Item: " + item +
                ", Price=" + itemPrice +
                " AUD";
    }
}
