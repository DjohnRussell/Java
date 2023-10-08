package acadmey.learnprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("                      BILLS BURGERZ \n");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀         ⢀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣴⣾⣿⣿⣿⣿⠿⠛⠿⣿⣫⣽⣿⣿⣷⣿⣻⣿⣶⣤⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣾⣿⠟⡛⣿⡆⠉⣉⣿⠋⢀⣀⣀⣴⡷⠘⠋⢙⣿⣿⣿⠿⢿⣿⣿⣿⣿⠷⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⢀⣴⣾⣿⡿⠃⢀⠻⠟⠀⠀⠘⠛⠁⠀⠀⠙⣅⣉⠀⠀⠀⠾⠷⠰⡦⣄⠸⣿⣟⢿⣿⣷⠛⣬⣗⢦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⡔⢯⣤⡼⠋⣿⣿⠟⠀⠀⠀⢤⣄⠠⣿⠇⠀⠈⠛⠋⠀⠀⣦⡄⠀⠀⣈⠁⠀⠉⠁⠀⠉⠽⣷⣶⣝⣇⡙⢦⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⣴⡯⢍⡿⠋⠀⠀⠉⠉⠀⠀⠀⠀⠈⠉⠻⣶⣦⣀⣴⡖⠀⠀⠀⠈⠁⠀⠸⠾⠁⠀⠀⠀⣄⡀⠀⠀⠘⢒⣉⣿⣦⣻⣆⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢀⡾⡟⣺⣿⡇⠀⣀⡀⠀⣀⣀⠀⠘⣷⠄⠀⠀⠀⠀⠀⠉⠁⠀⠀⠀⠀⠀⠀⠀⣀⡀⠀⠀⠀⠈⠉⢀⢀⡀⠰⣟⢿⣿⣿⣿⣧⠀⠀⠀⠀⠀\n" +
                "⠀⠀⢸⣷⠛⣿⠂⠀⠀⠘⠛⠚⠛⠉⠀⣀⡀⠀⠀⢠⣤⠀⠀⠀⠀⣰⡦⠀⠀⠀⠐⢄⢸⡿⣄⢄⢦⢀⡈⣄⠡⠱⣾⣷⣿⣿⣯⣿⣿⣧⠀⠀⠀⠀\n" +
                "⠀⠀⣤⣿⣿⣧⡄⠀⠀⠀⠀⠀⠀⠀⠸⠛⠁⠀⠀⠀⠛⠀⠀⠀⠀⠉⠁⠀⠀⠀⠱⣄⠣⠹⡜⢎⠳⢳⣷⣼⢶⣲⣶⣿⣿⣿⣿⣿⣽⡿⠀⠀⠀⠀\n" +
                "⠀⢸⠉⠈⢻⣿⣿⣦⡀⢄⠀⠀⠀⠀⠀⠀⠀⠀⠛⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢿⢆⣦⣴⢿⣿⣧⣿⣼⣿⣿⣿⣿⣿⣯⣽⣿⣷⠀⠀⠀⠀\n" +
                "⣠⣾⣿⡏⢸⣿⢻⣿⣿⣿⣟⣾⣿⣦⣤⣤⠤⢀⣠⡀⣀⢀⣠⣤⣀⣠⣤⡀⠀⠀⣤⣶⣾⡿⣾⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡛⣿⣿⡇⠀⠀\n" +
                "⢿⡿⡏⠀⠘⠛⢛⣿⣯⣩⣭⣿⣿⠿⣿⣿⣿⣾⣿⣿⣿⣯⣴⣦⣬⣾⣗⣶⣶⣶⣾⣿⣿⣷⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣻⣿⣿⣿⣿⣾⣿⣿⠀⠀\n" +
                "⠀⠙⠧⢤⣴⣾⣿⣿⣿⣯⣭⣉⠛⠒⠛⠛⠛⢋⡽⠛⠛⢛⣻⣿⣿⡛⣿⡟⠛⣻⡟⢿⣿⣿⣿⢿⣿⣿⢿⣿⣿⣿⣿⣯⣿⣿⣿⣿⣿⠏⠉⠁⠀⠀\n" +
                "⠀⠀⠀⢀⣿⣿⡿⣽⣿⡿⣿⣿⣄⠀⠀⠀⣠⣾⡇⠀⣴⣿⣟⣉⣿⣿⣿⢷⣾⣿⣧⢀⣿⣿⣿⣿⣿⠏⢸⣿⣿⣿⡿⠿⠛⠛⣉⣼⣿⣦⡀⠀⠀⠀\n" +
                "⠀⠀⢀⣿⣿⣿⣷⣶⣍⣛⣛⠻⠿⣶⣾⣿⣿⣿⣷⣾⡟⠻⢿⣿⣽⣿⡙⠛⠛⠛⠛⣛⣻⣿⣿⣿⣿⣶⣿⣿⣿⣿⣷⣶⠴⠾⠛⣹⣿⣿⣷⠀⠀⠀\n" +
                "⠀⢸⡛⢹⣿⣿⠛⠛⢿⣿⣿⣿⣾⣿⣿⣿⣿⠿⢿⣗⡾⢿⣿⣿⣏⠉⠉⠛⠛⠛⠛⠛⠙⠉⢉⣠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣵⣿⣿⣿⠿⠤⣄⡀\n" +
                "⢀⣸⣇⣀⠻⣿⣦⣰⣾⣥⣽⣿⣿⠿⢿⣿⣷⣦⣶⣿⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⣀⣴⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣻⣿⣿⣿⣿⡟⠄⣒⣰⣿\n" +
                "⢸⡏⠟⠁⠀⣘⣻⣿⣿⣿⣿⣿⣿⣇⣼⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣮⡳⣄⠀⣠⣾⣿⣿⢿⣿⣿⣯⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⠁⠘⠿⠯⣷⠃\n" +
                "⠘⢧⣴⡿⣿⣻⣿⡟⠻⢨⢍⣿⣟⡿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣾⣿⣿⣿⣿⣿⣾⣿⣿⣿⢿⣿⣿⣿⣿⣟⣿⣿⣿⣯⣟⣦⣴⣿⠟⠀\n" +
                "⠀⠀⠀⠀⣿⣿⣗⣡⣄⡆⢸⡿⠿⣿⡶⢶⣴⣛⠄⠀⣨⡽⢿⣿⣿⣿⣿⣿⡟⠛⣻⣿⣿⣿⣿⣏⣀⣤⠶⣇⣠⡞⣿⣿⡋⠀⠙⢿⣿⣿⠉⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠹⣿⣎⠈⠃⠛⠻⣿⠿⡏⠟⠁⢀⣭⠑⠞⢹⣠⡄⣴⣾⣿⡿⠏⠀⠀⣷⣾⡃⣿⣿⣿⣷⣿⠀⠀⢰⣿⣿⣿⣇⣰⣶⣾⣿⡟⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠙⠻⣷⣦⣀⡀⠀⠀⠹⠢⠶⣿⣷⣀⣀⣸⣿⣿⡿⣿⣿⣄⡀⠀⠀⣿⡟⠇⠹⣿⣿⣿⣿⡄⠘⣿⡿⣿⠿⡿⣿⣯⣿⠟⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣶⣤⣤⣀⡀⠀⠀⠀⠀⠉⠈⠀⠀⠀⠈⠛⠿⠖⢾⡛⠛⣚⡿⣿⡟⣿⠹⠛⢻⢟⣷⣯⣼⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠷⢶⣦⣤⣤⣤⣤⣄⣀⣀⣀⣠⣀⣠⣈⣡⣵⣇⣼⣷⣦⡷⠾⠟⠛⠉⠉⠁⠀⠀⠀⠀⠀⠀");



        MeatPatty beef = new MeatPatty("Beef", 5.99);
        MeatPatty pork = new MeatPatty("Pork", 3.99);
        MeatPatty mix = new MeatPatty("Mixed", 2.99);
        MeatPatty duck = new MeatPatty("Duck", 7.99);

        ArrayList mList = new ArrayList<>();

        Items tomato = new Items("Tomato", 0.30);
        Items lettuce = new Items("Lettuce", 0.10);
        Items pickles = new Items("Pickles", 0.10);
        Items bacon = new Items("Bacon", 1.00);

        ArrayList itemList = new ArrayList();
        itemList.add(tomato);
        itemList.add(lettuce);
        itemList.add(pickles);
        itemList.add(bacon);


        ArrayList meatList = new ArrayList<>();
        meatList.add(beef);
        meatList.add(pork);
        meatList.add(mix);
        meatList.add(duck);



        int counter;
        counter = 1;

        System.out.println("Meets: ");
        for (Object i: meatList) {
            System.out.println( "\n"+ "- " + counter++ + " " + i.toString());
        }

        System.out.println("\nItems: ");
        int counterTwo;
        counterTwo = 1;
        for (Object i:itemList) {
            System.out.println("\n"+ "- " + counterTwo++ + " " + i.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Choose meet patty: ");
        int inputOne = scanner.nextInt();
        if (inputOne == 1) {
            MeatPatty ord = new MeatPatty("Beef", 5.99);
            System.out.println("Choose your item: ");
            int inputTwo = scanner.nextInt();
            if (inputTwo == 1) {
                Items add = new Items("Tomato", 0.30);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }

            } else if (inputTwo == 2) {
                Items add = new Items("Lettuce", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 3) {
                Items add = new Items("Pickles", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 4) {
                Items add = new Items("Bacon", 1.00);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            }
            } else if (inputOne == 2) {
                MeatPatty ord = new MeatPatty("Pork", 3.99);
            System.out.println("Choose your item: ");
            int inputTwo = scanner.nextInt();
            if (inputTwo == 1) {
                Items add = new Items("Tomato", 0.30);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 2) {
                Items add = new Items("Lettuce", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 3) {
                Items add = new Items("Pickles", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 4) {
                Items add = new Items("Bacon", 1.00);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            }
            } else if (inputOne == 3) {
                MeatPatty ord = new MeatPatty("Mixed", 2.99);
            System.out.println("Choose your item: ");
            int inputTwo = scanner.nextInt();
            if (inputTwo == 1) {
                Items add = new Items("Tomato", 0.30);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 2) {
                Items add = new Items("Lettuce", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 3) {
                Items add = new Items("Pickles", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 4) {
                Items add = new Items("Bacon", 1.00);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            }
            } else if (inputOne == 4) {
                MeatPatty ord = new MeatPatty("Duck", 7.99);
            System.out.println("Choose your item: ");
            int inputTwo = scanner.nextInt();
            if (inputTwo == 1) {
                Items add = new Items("Tomato", 0.30);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 2) {
                Items add = new Items("Lettuce", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 3) {
                Items add = new Items("Pickles", 0.10);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            } else if (inputTwo == 4) {
                Items add = new Items("Bacon", 1.00);
                System.out.println("Choose next item: ");
                int inputThree = scanner.nextInt();
                if (inputThree == 2){
                    Items addTwo = new Items("Lettuce", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 3) {
                    Items addTwo  = new Items("Pickles", 0.10);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                } else if (inputThree == 4) {
                    Items addTwo  = new Items("Bacon", 1.00);
                    FinalBurger yourBurger = new FinalBurger(add, addTwo, ord);
                    System.out.println("You chose " + ord.getMeat() + " ," + add.getItem() +
                            " ," + addTwo.getItem());
                    System.out.println("Total : " + yourBurger.getTotal() + " AUD");
                }
            }
            }



    }
    }

