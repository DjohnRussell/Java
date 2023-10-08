package no.hiof.danieljr;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Dinosaur>dinosaurs = new ArrayList<>();
        ArrayList<City>cities = new ArrayList<>();

        dinosaurs.add(new Dinosaur(1, "Tyrannosaurs Rex", "Carnivore", "Land"));
        dinosaurs.add(new Dinosaur(2, "pterodactyl", "Carnivore", "Sky"));
        dinosaurs.add(new Dinosaur(3, "Quetzalcoatlus", "Carnivore", "Sky"));
        dinosaurs.add(new Dinosaur(4, "Mossasaurus", "Carnivore", "Sea"));
        dinosaurs.add(new Dinosaur(5, "Elasmosaurus", "Carnivore", "Sea"));
        dinosaurs.add(new Dinosaur(6, "Stegosaurus", "Herbivore", "Land"));
        dinosaurs.add(new Dinosaur(7, " Brachiosaurus", "Herbivore", "Land"));

        cities.add(new City(1, "Oslo", 1710000));
        cities.add(new City(2, "Halden", 22184));
        cities.add(new City(2, "Fredrikstad", 82000));
        cities.add(new City(3, "Madrid", 6669000));
        cities.add(new City(4, "Sydney", 4992000));
        cities.add(new City(5, "Tokyo", 13960000));
        cities.add(new City(6, "Istanbul", 15840900));
        cities.add(new City(7, "Johannesburg", 5927000));


        skrivTilJsonFil(dinosaurs, "Dinosaurs.Json");
        skarivTilJOSONFILC(cities, "Cities.Json");


    }

    private static void skrivTilJsonFil(ArrayList<Dinosaur> dinosaurs, String s) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(s), dinosaurs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private  static void skarivTilJOSONFILC(ArrayList<City> cities, String c){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(c), cities);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
