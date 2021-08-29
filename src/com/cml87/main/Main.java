package com.cml87.main;

import com.cml87.utils.Myutils;

/*
 * Method overloading is defining two methods with the same name a given class, but with different signatures.
 *
 * In Java a method signature is the combination of the method name, its number of parameters, the type of parameters
 * and order of parameters. Java cannot distinguish between two methods with the same signature. Therefore, method
 * overloading is only allowed for methods that differ in their signature somehow.
 *
 * The return type, method modifiers, and thrown exceptions do not form part of the method signature.
 *
 * Method overloading is used to define methods that have very similar logic but differ in some details. Sometimes
 * 'generics' can be used instead of method overloading, avoid to define several methods with the same name.
 *
 * Method overloading is commonly used with class constructors.
 *
 * Method overloading is one of the three types of polymorphisms that exist in Java: static polymorphism.
 * It's is static because at compile time the compiler will know which method version to use, performing an 'early
 * binding' between the caller code and the method.
 *
 * The other two types of polymorphism are 'subtype polymorphism' (OOP and inheritance) and 'parametric polymorphism'
 * (generics)
 *
 * */


public class Main {

    // Two methods with the same signature
    // public void foo( double d){}
    // public int foo(double d){}

    public static void main(String[] args) {

        System.out.println("Hello jar jar!");
        Myutils.print();

    }

}
