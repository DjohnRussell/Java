package no.hiof.danieljr;

import no.hiof.danieljr.models.HourToSeconds;
import no.hiof.danieljr.models.Kilo;
import no.hiof.danieljr.models.liters;
import no.hiof.danieljr.models.year;

import java.time.Year;


public class Main {

    public static void main(String[] args) {


        //5000 seconds
        System.out.println(HourToSeconds.SecondsToHour(5000) + "H");
        //1 hour
        System.out.println(HourToSeconds.hourToSeconds(1.0) + "Sec");
        //3 hours
        System.out.println(HourToSeconds.hourToSeconds(3.0) + "Sec");
        // 1 ml to liter
        System.out.println(liters.mlToL(10.0) + "L");
        //2.5 ml to liter
        System.out.println(liters.mlToL(25.0) + "L");
        //100 ml to liter
        System.out.println(liters.ltoMl(2.0) + "ml");
        // dl to liter
        System.out.println(liters.dlTol(10) + "L");
        // liter to dl
        System.out.println(liters.lTodL(1.0) + "Dl");
        //kg to gram
        System.out.println(Kilo.kgToGram(1) + "Gr");
        //gram to kg
        System.out.println(Kilo.gramToKm(3400.0) + "Kg");

        year.yearToMinutes(1);
        year.yearToMinutes(10);
        year.yearToMinutes(5);
        year.yearToMinutes(7);

        year.yearToSec(1);
        year.yearToSec(28);
        year.yearToSec(30);


        System.out.println("While loop as 1 - 10 ");
        int n = 0;
        while (n != 10) {
            n++;
            year.yearToSec(n);
        }


    }
}
