package no.hiof.danieljr.models;

public final class edibleFlowers extends flower{
    private String cusineType;

    public edibleFlowers(String name, String famile, String color, int blossomTime, String seasonForBlossom,
                         String cusineType) {
        super(name, famile, color, blossomTime, seasonForBlossom);
       this.cusineType = cusineType;
    }

    public String getCusineType() {
        return cusineType;
    }

    public void setCusineType(String cusineType) {
        this.cusineType = cusineType;
    }

    @Override
    public String toString() {
        return "ateableFlower{" +
                "cusineType='" + cusineType + '\'' +
                ", color='" + getColor() + '\'' +
                ", blossomTime=" + getBlossomTime() +
                ", seasonForBlossom='" + getSeasonForBlossom() + '\'' +
                ", name='" + getName() + '\'' +
                ", famile='" + getFamile() + '\'' +
                '}';
    }
}
