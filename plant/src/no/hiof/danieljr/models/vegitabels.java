package no.hiof.danieljr.models;

public class vegitabels extends plant{
     private String cusineVeggieIsUsed;


    public vegitabels(String name, String famile, String cusineVeggieIsUsed) {
        super(name, famile);
        this.cusineVeggieIsUsed = cusineVeggieIsUsed;
    }

    @Override
    public void plantBenefit() {
        System.out.println("Vegetables are rich in different vitamins and healty too eat ");
    }

    @Override
    public String toString() {
        return "vegitabels{" +
                "cusineVeggieIsUsed='" + cusineVeggieIsUsed + '\'' +
                ", name='" + getName() + '\'' +
                ", famile='" + getFamile() + '\'' +
                '}';
    }

    public String getCusineVeggieIsUsed() {
        return cusineVeggieIsUsed;
    }

    public void setCusineVeggieIsUsed(String cusineVeggieIsUsed) {
        this.cusineVeggieIsUsed = cusineVeggieIsUsed;
    }
}
