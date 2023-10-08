package no.hiof.danieljr.models;



public class year {
    public static void yearToMinutes(int amountOfYears){
        int year = 365;
        int day = 24;
        int oneHourInMin = 60;
        int oneYear = year * day * oneHourInMin * amountOfYears;
        System.out.println(amountOfYears + " years in minutes are : " + oneYear + " in minutes");


    }

    public static void yearToSec(int amountOfYears){
        int yearInSec = 365 * 24 * 60 * 60 * amountOfYears;
        System.out.println( amountOfYears + " years in seconds are : " +  yearInSec + " Sec" );
    }

    public static void secToYear(double amountOfSeconds){
        int secondsInYear = 360/24/60/60 * (int)(amountOfSeconds);
        System.out.println(amountOfSeconds + " seconds in years are : " + secondsInYear + " Year");
    }




}
