package com.cml87.main;

import com.cml87.utils.Myutils;  // other package, so we need to import this class
/*
 *
 * Classes in the same package as the package of the class from where we are using them, do not need import.
 * From the directory having the base package 'com' we can run this program as
 * java com.cml87.main.Main bim piu
 *
 *
 *
 * */


public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(10);

        for (int i=0; i < args.length; i++ ){
            sb.append(args[i]);
        }

        System.out.println("The command line arguments are (removing spaces): ");
        Myutils.print(sb.toString());

        Dev.aux(); //method of the same package. It doesn't need import

    }

}
