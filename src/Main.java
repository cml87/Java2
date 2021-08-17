/*
 * Implicit casting also takes places with methods return type. If it can be done without data lose Java will do it
 * without complain. If it can't, it will complain.
 *
 *
 * */


import java.util.Arrays;

class Myint {

    int x;

    public Myint() { //if a parametric constructor is defined for a class, the parameterless constructor will
        // no be included by default, so we need to write it
    }

    public Myint(int x) {
        this.x = x;
    }

    // a copy constructor
    public Myint(Myint another) {
        this.x = another.x;
    }

}


public class Main {

    public static double returnDouble() {
        int x = 4;
        return x;
    }

    public static int returnInt() {
        double y = 4.7;
        //return y;      //this will not be allowed cuz there is no implicit conversion (without data lose)
                        // from double to int
        return (int)y;  //explicit casting
    }


    public static void main(String[] args) {

        System.out.println("cast to double from int: " + returnDouble());
        System.out.println("explcit cast to int from double (data lose): " + returnInt());
    }

}
