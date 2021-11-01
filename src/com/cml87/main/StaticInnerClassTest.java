package com.cml87.main;

import com.cml87.utils.Myutils;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;




public class StaticInnerClassTest {

    public static void main(String[] args) {
        double[] d = new double[20];
        for (int i=0;i<d.length;i++)
            d[i]=100*Math.random();

        System.out.println("Array is: "+Arrays.toString(d));

        ArrayAlg.Pair p = ArrayAlg.minmax(d);
        System.out.println("min = " + p.getFirst());
        System.out.println("max = " + p.getSecond());

        ArrayAlg.Pair aap;
        aap = new ArrayAlg.Pair(7,9);
        System.out.println("min is: "+aap.getFirst());
        System.out.println("min is: "+aap.getSecond());

        ArrayAlg.Pair aap2 = new ArrayAlg.Pair(88,788);
        System.out.println("min is: "+aap2.getFirst());
        System.out.println("max is: "+aap2.getSecond());

        ArrayAlg.Pair aap3 = aap2.callMM();
        System.out.println("min is: "+aap3.getFirst());
        System.out.println("max is: "+aap3.getSecond());
    }

}

class ArrayAlg{

    public static class Pair{
        private double first;
        private double second;

        public Pair(double f,double s){
            first = f;
            second = s;
        }

        public double getFirst(){return first;}
        public double getSecond(){return second;}

        public static String print(String str){
            double[] dd = new double[]{-90,2,90,22};
            minmax(dd); // call to a static method of the outer class

            ArrayAlg aa = new ArrayAlg();
            aa.nonStaticMethod(); // call to a non static method of the outer class

            return str;
        }

        public Pair callMM(){
            //cannot call directly non static fields and methods of the outer class
            //System.out.println(xx);

            ArrayAlg aa = new ArrayAlg();
            aa.nonStaticMethod(); // call to a non static method of the outer class

            double[] dd = new double[]{-90,2,90,22};
            return minmax(dd); // call to a static method of the outer class
        }
    }



    int xx=3;
    //non static method access to static and non static methods of the inner class
    void nonStaticMethod(){
        Pair.print("der"); //static method call
        Pair p = new Pair(222,99);
        p.getFirst(); //non static method call
    }

    //static method access to static and non static methods of the inner class
    static void staticMethod(){
        Pair.print("der");  //static method call
        Pair p = new Pair(222,99);
        p.getFirst(); //non static method call
    }

    public static Pair minmax(double[] values){
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        for (double v: values){
            if(min>v) min=v;
            if(max<v) max=v;
        }

        Pair p1 = new Pair(1,2);
        Pair p2 = new Pair(3,4);
        Pair p3 = new Pair(min,max);

        p3.getFirst();

        return p3;
    }

}

