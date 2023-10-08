package acadmey.learnprogramming;

public class MeatPatty {
    private String meat;
    private double meatPrice;

    public MeatPatty(String meat, double meatPrice) {
        this.meat = meat;
        this.meatPrice = meatPrice;
    }

    public String getMeat() {
        return meat;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    @Override
    public String toString() {
        return  " " + "MeatPatty" +
                ": " + meat  +
                ", Price=" + meatPrice + " AUD";
    }
}
