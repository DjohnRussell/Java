package acadmey.learnprogramming;

public class FinalBurger {
    private Items items;

    private Items itemsTwo;

    private Items itemsThree;

    private Items itemsFour;
    private MeatPatty meatPatty;

    private double total;



    public FinalBurger(Items items, Items itemsTwo, MeatPatty meatPatty) {
        this.items = items;
        this.itemsTwo = itemsTwo;
        this.meatPatty = meatPatty;
        this. total = 6.99 + items.getItemPrice() + getMeatPatty().getMeatPrice() +
        itemsTwo.getItemPrice();
    }

    public Items getItemsTwo() {
        return itemsTwo;
    }


    public Items getItems() {
        return items;
    }

    public MeatPatty getMeatPatty() {
        return meatPatty;
    }

    public double getTotal() {
        return total;
    }
}
