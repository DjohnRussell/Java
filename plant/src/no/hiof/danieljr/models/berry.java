package no.hiof.danieljr.models;

public class berry extends plant {
    private String color;
    private String whereToFine;
    private String sesaon;

    public berry(String name, String famile, String color, String whereToFine, String sesaon) {
        super(name, famile);
        this.color = color;
        this.whereToFine = whereToFine;
        this.sesaon = sesaon;
    }

    @Override
    public String toString() {
        return "berry{" +
                "color='" + color + '\'' +
                ", whereToFine='" + whereToFine + '\'' +
                ", sesaon='" + sesaon + '\'' +
                ", name='" + getName() + '\'' +
                ", famile='" + getFamile() + '\'' +
                '}';


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWhereToFine() {
        return whereToFine;
    }

    public void setWhereToFine(String whereToFine) {
        this.whereToFine = whereToFine;
    }

    public String getSesaon() {
        return sesaon;
    }

    public void setSesaon(String sesaon) {
        this.sesaon = sesaon;
    }
}
