package no.hiof.danieljr.models;

public class HourToSeconds {

    //3600 seconds in an hour

    public static double hourToSeconds(double Hours){
        double seconds = Hours * 3600;
        return seconds;
    }


    public static double SecondsToHour(double seconds){
        double hour = seconds / 3600;
        return hour;
    }


}
