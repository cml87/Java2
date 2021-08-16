/*
 * When arguments in a method invocation do not match the type of the corresponding parameter in the method definition,
 * Java will try to make an implicit casting. If it succeeds, it will not complain at all and will execute the method.
 * If it can't, for example because there would be some data lose, it will throw and exception at Runtime.
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

    public static int sum(int x, int y) { return x + y; }



    public static void main(String[] args) {

        byte x = 1;
        byte y = 2;

        int a = 2;
        float b = 4.f;  // the f, or F, indicates the compiler to interpret this literal as a float
        double c = 8.78; //or 8.78d or D

        System.out.println("Sum of x and y is: "+sum(x,y)); //3

        // Runtime Error: "public static int sum(int x, int y) { return x + y; }"
        //System.out.println("Sum of a and b is: "+sum(a,b));


        // Notice how expressions passed as arguments are first evaluated, from left to right, to get a value,
        // and then that value is passed to the function. In the expression evaluation, variables' values can be
        // changed !
        x = 5;
        System.out.println("Sum of x-=5 and x is: "+sum(x-=5,x)); // prints 0. In the first argument expression we make
        // x==0 and pass that to the method. The second argument will then be zero. 0+0=0

        x=6;
        System.out.println("\"x-=9\" is: "+(x-=9)); // prints -3

        x=6;
        y=4;
        //System.out.println("Sum of x/0 and y-=3 is: "+sum(x/0,y-=3)); //ArithmeticException when evaluating first
        // argument expression. Second argument expression will not be evaluated, thus 'y' will not be changed

    }

}
