package com.cml87.main;

import com.cml87.utils.Myutils;

class Classb{
     int x =4;

     // toString() method overwriting superclass Object.toString() method
     public String toString(){
         return String.valueOf(x);
     }

     public Classb (int x){
         this.x = x;
     }
}

// This class with the default parameterless constructor will not be allowed
// cuz it would call the parameterless constructor of its superclass which
// doesn't exist
// class Classc extends Classb {}


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

        Myutils myutils0;

        // We cannot instantiate an object of class Myutils cuz the constructor we are calling with new
        // has 'default' visibility (ie. only in package). There it's not visible here, we're in another package.
        //Myutils myutils = new Myutils(4);


    }

}
