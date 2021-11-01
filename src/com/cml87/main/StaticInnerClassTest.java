package com.cml87.main;

import com.cml87.utils.Myutils;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

enum Months {
    JANUARY("Enero"),
    FEBRUARY("Febrero"),
    MARCH("Marzo");

    private final String spanishName;

    Months(String spanishName) {
        this.spanishName = spanishName;
    }

    public String getSpanishName(){return spanishName;}
}


public class StaticInnerClassTest {

    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i = 0; i < d.length; i++)
            d[i] = 100 * Math.random();

        System.out.println("Array is: " + Arrays.toString(d));

        Months currentMonth = Months.MARCH;

        switch (currentMonth){
            case JANUARY:
                System.out.println("This month is: "+currentMonth.toString());
                break;
            case MARCH:
                System.out.println("This month isss: "+currentMonth.toString());
                break;
            default:
                System.out.println("We are in no month !!");
        }

        Months[] allMonths = Months.values();

        //for (Months m: Months.values())
        for (int i=0; i< allMonths.length;i++)
            System.out.printf("%s in Spanish is %s\n",allMonths[i].toString(), allMonths[i].getSpanishName());

        currentMonth = Months.valueOf("JANUARY");

        if (currentMonth==Months.JANUARY)
            System.out.println("Now we are in January");

        Object o = Months.MARCH;

        System.out.println(currentMonth.equals(o));
        System.out.println("enum pointed to by reference 'currentMonth' has name is: "+currentMonth.name());


    }


}
