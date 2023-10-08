package no.hiof.danieljr;

public class Dinosaur {
    int id;
    String name;
    String type;
    String habitat;

    public Dinosaur(int id, String name, String type, String habitat) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.habitat = habitat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
