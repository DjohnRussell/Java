package no.hiof.danieljr.models;

public class Kilo {

    public static double gramToKm(double gram){
        double kg = gram / 1000;
        return  kg;

    }

    public static double kgToGram(double kg){
        double gram = kg * 1000;
        return gram;
    }
}
