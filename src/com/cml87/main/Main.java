package com.cml87.main;

import com.cml87.utils.Myutils;

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

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
