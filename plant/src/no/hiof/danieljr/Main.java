package no.hiof.danieljr;

import no.hiof.danieljr.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        //----------------------ArrayLists---------------------
        ArrayList<flower> flowers = new ArrayList<>();
        ArrayList<herb> herbs = new ArrayList<herb>();
        ArrayList<berry> berries = new ArrayList<berry>();
        ArrayList<vegitabels> vegitabelsArrayList = new ArrayList<vegitabels>();
        ArrayList<edibleFlowers> edibleFlowers = new ArrayList<>();


        //---------------Objects Of Classes in Lists-------------
        //--------------------FLowers----------------------------
        flowers.add(new flower("Old garden Rose", "Rosaceae", "Pink", 35,
                "Spring"));
        flowers.add(new flower("Wild Rose", "Rosaceae", "Pink", 20,
                "Summer"));
        flowers.add(new flower("Modern garden Rose", "Rosaceae", "Pink/Red", 40,
                "Spring/Summer"));
        flowers.add(new flower("Dandelion", "Rosaceae", "White", 14,
                "Spring/Summer"));
        //-----------------------Edible flowers-----------------------
        edibleFlowers.add(new edibleFlowers("Lavendel", "Lamiaceae", "Purple",
                50, "Spring/Summer", "Deserts/Cakes/tea"));


        //-------------------------Vegitables-------------------------
        vegitabelsArrayList.add(new vegitabels("Corn", "Poaceae", "Mexican/Latin"));
        vegitabelsArrayList.add(new vegitabels("Potato", "Solanaceae",
                "Nordic/Europeian/South-American"));


        //--------------------Herbs------------------------------
        herbs.add(new herb("Rosemarry", "Lamiaceae", "Antioxidants/Anti-inflammatory",
                "Italian"));
        herbs.add(new herb("Thyme", "Lamiaceae", "Promotes good health, rich in c-vitamine",
                "Nordic/French"));
        herbs.add(new herb("Sage", "Lamiaceae", "Spiritual, Promotes good health," +
                " rich of vitamines ", "French/General kitchen herb"));


//---------------------Berry-----------------------------
        berries.add(new berry("Rasberry", "Rosaceae", "Red", "Forest/Wild",
                "Spring/Summer"));
        berries.add(new berry("Blueberry", "Ericaceae", "Blue", "Forset",
                "Spring/Summer"));
        berries.add(new berry("Huckleberries", "Ericaceae", "Pantone", "Forset",
                "Spring/Summer"));

// -------------Testing Polymorphism overloading of methods--------------
        System.out.println("------------------Polymorhi Motoder---------------------------");
        System.out.println("***Polymorphism, overloading***");
        berries.get(0).plantIsGreen();
        herbs.get(0).plantIsGreen("Rosemary");
        herbs.get(1).plantIsGreen("Thyme", false);
        System.out.println();

//-----------------Testing Polymorphism override of methods-------------------
        System.out.println("\n***Polymorphism, overrideing***");
        herbs.get(0).plantBenefit();//This method the same as in plant(the original method, it's not overridden)
        flowers.get(0).plantBenefit();
        vegitabelsArrayList.get(1).plantBenefit();


//----------------Lister-----------------
        System.out.println("\n------------List size---------------");
        System.out.println("Herbs:");
        System.out.println(herbs.size());
        System.out.println("Vegtibales:");
        System.out.println(vegitabelsArrayList.size());
        System.out.println("Flowers:");
        System.out.println(flowers.size());
        System.out.println("Edible Flowers:");
        System.out.println(edibleFlowers.size());

//------------------------HashMaping--------------------------------
        // rate of how difficult veggis are to grow from seed.
        System.out.println("-----------Hashmap like key value(Redis)-------------");
        HashMap<String, Integer> rateForGrowingVeggis = new HashMap<>();
        String Corn = String.valueOf(vegitabelsArrayList.get(0));
        String Potato = String.valueOf(vegitabelsArrayList.get(1));
        rateForGrowingVeggis.put(Corn, 4);
        rateForGrowingVeggis.put(Potato, 1);
        System.out.println("Corn's difficulty level is: " + rateForGrowingVeggis.get(Corn));
        System.out.println("Potato's difficulty level is: " + rateForGrowingVeggis.get(Potato));
        // if we do not have a veggis in the list we can still use the hash map,
        rateForGrowingVeggis.put("Tomato", 5);
        System.out.println("Tomato's difficulty level is: ");
        System.out.println(rateForGrowingVeggis.get("Tomato"));

        int number = 0;
        while (number < 10) {
            number++;
            System.out.println("Counting - " + number);
        }
        System.out.println();
        for (herb h: herbs){
            System.out.println(h.toString());
        }
        System.out.println();
        for (vegitabels v : vegitabelsArrayList){
            System.out.println(v.toString());
        }
        System.out.println();
        for (flower f : flowers){
            System.out.println(f.toString());
        }

        System.out.println();
        for(berry b : berries){
            System.out.println(b.toString());
        }

        System.out.println();
        for(edibleFlowers e : edibleFlowers){
            System.out.println(e.toString());
        }
        File flower = new File("Flowers.csv");

        try {
            BufferedWriter bf = new BufferedWriter(new FileWriter("Flowers.csv"));
            for(flower f : flowers){
            bf.write(f.toString() + "\n");}
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
        biggestFamily(herbs, flowers);
        biggestFamily(edibleFlowers, flowers);
        biggestFamily(herbs, vegitabelsArrayList);


    }



    private static void biggestFamily(ArrayList x , ArrayList y ) {
        if(y.size() > x.size()){

            System.out.println(x.toString() + "Has the amount of: " + x.size() + " in the list!");
        }
        else
            System.out.println(y.toString() + "Has the amount of: " + y.size() + " in the list!");



    }
}
















