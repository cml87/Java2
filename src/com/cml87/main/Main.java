package com.cml87.main;

import com.cml87.utils.Myutils;

class Classb{
     int x =4;

     // toString() method overwriting superclass Object.toString() method
     public String toString(){
         return String.valueOf(x);
     }

}



public class Main {

    private int x;

    private static String str;

    private final int y;

    // an instance initializer block to initialize instance variables
    {
        //x =7;
        y = 3;  //variable y must be initialized cuz it's final
    }

    // a static initializer block to initialize static fields
    static {
        str = "Hello!";
    }

    public static void main(String[] args) {

        Classb classb = new Classb();

        //method to String is called automatically whenever a a reference type is used alone
        String str = classb + " hello";
        System.out.println(classb);
        System.out.println(str);

    }

}
