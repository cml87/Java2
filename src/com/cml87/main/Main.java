package com.cml87.main;

import com.cml87.utils.Myutils;

class ClassA{
    static int c=-1;
    static int x;

    static {
        c++;
        System.out.println("static initializer block run");
    }

    ClassA(String sup){
        // this constructor will do nothing. I just want to see if it triggers the static initializer block
    }

    ClassA() {
        System.out.println("field c incremented inside constructor");
        c++;
    }

    public static void printC(){
        System.out.println(c);
    }

    public void printHello(){
        System.out.println("Hello");
    }
}

public class Main {

    public static void main(String[] args) {

        //ClassA ca = new ClassA("sup");

        //ClassA ca1 = new ClassA("sup");

        //ClassA.printC(); // prints 0, cuz before the constructor body is run, the static initializer block is run

        //ClassA.printC();
        //ClassA.c = 3;

        ClassA.x = 4;
        System.out.print("c is: "); // this will trigger the static initializer block as well
        ClassA.printC();

        //ClassA ca3 = new ClassA("sup");
        //ca3.printHello();

    }

}
