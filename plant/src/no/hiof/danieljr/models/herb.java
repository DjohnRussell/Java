package no.hiof.danieljr.models;

public class herb extends plant {
    private String bennefit;
    private String food;

    public herb(String name, String famile, String bennefit, String food) {
        super(name, famile);
        this.bennefit = bennefit;
        this.food = food;
    }

    public String getBennefit() {
        return bennefit;
    }

    public void setBennefit(String bennefit) {
        this.bennefit = bennefit;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "herb{" +
                "food='" + food + '\'' +
                ", name='" + getName() + '\'' +
                ", famile='" + getFamile() + '\'' +
                '}';
    }
}
