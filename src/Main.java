/*
* - static methods are called class methods. They are normally used to access static fields of their class,
*   as these cannot be accessed from instance methods (non static methods).
*
*   Static, or class, methods cannot access non-static (or instance) members (fields and methods). They must use
*   an object reference for for this. Similarly they cannot use the 'this' keyword as there is no instance for 'this'
*   to refer to.
*
* - 'main' is just the method that a Java program executes my default.
*
* */


class Myint {

    int x;
    private static double num;

    public Myint() { //if a parametric constructor is defined for a class, the parameterless constructor will
        // no be included by default, so we need to write it
    }

    public Myint(int x) {
        this.x = x;
    }

    public void printHello(){
        System.out.println("Hello");
    }

    static double getNum(){
        //System.out.println("value of x is" + String.valueOf(x) );// not ok cuz x is non-static
        //printHello(); //not ok, cuz method printHello() is non-static
        return num;
    }

    static double getNum(Myint myint){
        System.out.println("value of x is" + String.valueOf(myint.x) );// access non-static x field through an
        // instance reference
        myint.printHello(); // access non-static printHello() through an instance reference
        return num;
    }

}


public class Main {

    public static void main (String[] args){

        Myint myint = new Myint();
        myint.x =3;

        final Myint myint2 = new Myint(5); // a final reference, so it cannot be reassigned
        myint.x =6;  //this is ok

        //myint2 = new Myint(); // this is not ok, cuz the reference myint2 was declared final

        printMyInt(myint);

    }

    static void printMyInt(final Myint myint){
        myint.x = 4; // this is ok, we are modifying the object pointing to by the reference
        //myint = new Myint(); // this is not ok, cuz we cannot make the reference point to somewhere else cuz its 'final'

        System.out.println("Myint is: " + myint.x);
    }

}
