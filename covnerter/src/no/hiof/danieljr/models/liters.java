package no.hiof.danieljr.models;

public class liters {
// milliliter to liter
    public static double mlToL(double ml){
        double liter = ml / 100;
        return liter;
    }
//Liter to milliliter
    public static double ltoMl(double l ) {
        double ml = l * 100;
        return ml;
    }
//desiliter to liter
    public  static double dlTol(double dl){
        double Liter = dl / 10;
        return Liter;
    }
// Liter to desiliter
    public static double lTodL(double l){
        double dl = l / 10;
        return dl;
    }

}
