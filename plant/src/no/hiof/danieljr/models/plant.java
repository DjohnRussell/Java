package no.hiof.danieljr.models;

public abstract class plant {
    private String name;
    private String famile;

    public plant(String name, String famile) {
        this.name = name;
        this.famile = famile;
    }

    //-----Final method dossent  override by the inherited classes--------
    public final void plantIsGreen(){
        System.out.println("A plant is a plant and its green!");

    }

    //------Polymorphism overloading example--------
    // same method name but changing/or adding a parameter will let the method overload.
    public final void plantIsGreen(String name){
        System.out.println(name + " is a plant");

    }
    //------Polymorphism overloading by adding String name and boolean rare as parameter.--------
    public final void plantIsGreen(String name, boolean rare){
        System.out.println(name + " Is a plant that is rare:" + rare);

    }

    //----Other example og Polymorphism is overriding, all that inherit form plant can----
    //have there one version of the method.

    public void plantBenefit(){
        System.out.println("Many of the pants has benefits");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamile() {
        return famile;
    }

    public void setFamile(String famile) {
        this.famile = famile;
    }
}
