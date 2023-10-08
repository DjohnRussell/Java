package no.hiof.danieljr.models;

public class flower extends plant{
    private String color;
    private int blossomTime;
    private String seasonForBlossom;


// Denne går ikke og override siden den er Final i plant
/*@Override
public void plantIsGreen(){
        System.out.println("test");
    }*/

    //-----Polymorphism, method overriding example--------


    @Override
    public void plantBenefit() {
        System.out.println("Flowers have a good sent, are dekorative and creates harmony and peace");
    }

    public flower(String name, String famile, String color, int blossomTime, String seasonForBlossom) {
        super(name, famile);
        this.color = color;
        this.blossomTime = blossomTime;
        this.seasonForBlossom = seasonForBlossom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBlossomTime() {
        return blossomTime;
    }

    public void setBlossomTime(int blossomTime) {
        this.blossomTime = blossomTime;
    }

    public String getSeasonForBlossom() {
        return seasonForBlossom;
    }

    public void setSeasonForBlossom(String seasonForBlossom) {
        this.seasonForBlossom = seasonForBlossom;
    }

    @Override
    public String toString() {
        return "flower{" +
                "color='" + color + '\'' +
                ", blossomTime=" + blossomTime +
                ", seasonForBlossom='" + seasonForBlossom + '\'' +
                ", name='" + getName() + '\'' +
                ", famile='" + getFamile() + '\'' +
                '}';
    }
}
