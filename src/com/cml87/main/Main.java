package com.cml87.main;

import com.cml87.utils.Myutils;

class ClassA{
    private int x = 33;  // the expression 33 is an instance variable initializer
    private int y;
    private int z;

    // this is an instance initializer block. It is executed only once, when and instance is created. It may contain
    // expression as well
    {
        x = 55;
        y = 88;
        z = x + y + foo();
        System.out.println("inside instance initialization block");
    }

    ClassA(int x) {
        System.out.println("inside constructor");
        this.x = x;
        System.out.println(y);
    }

    private int foo(){
        return 100;
    }
}

class MyTime{
    int h; int m; int s;

    public MyTime() {
        this (0, 0, 0);
    }
    public MyTime(int h) {
        // System.out.println("sss"); not allowed cuz a call to another constructor through this() must be the first
        // instruction
        this (h,0,0);
    }
    public MyTime(int h, int m) {
        this (h,m,0);
    }

    public MyTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString() {
        return "MyTime{" +
                "h=" + h +
                ", m=" + m +
                ", s=" + s +
                '}';
    }
}


public class Main {

    public static void main(String[] args) {

        ClassA ca = new ClassA(5);

        MyTime myTime = new MyTime(4);

        System.out.println(myTime);
    }

}
