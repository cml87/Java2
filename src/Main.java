/*
* - variables inside a method are private to the method, without the need of the private modifier, which actually
*   is not allowed in this case, it would be incorrect.
* - variables inside a method can be 'final'.
* - a method cannot be nested inside a another method
* - when a method runs, a space of memory called stack is allocated for all its needs, and is kept until the method exits
* - Java doesn't support method parameters with default values intended to be used if we don't supply an argument in
*  the a method call. For example, the following is not allowed
*   public void foo (int a = 10) {...}
*
* */


class Myint {

    int x;

    public Myint() { //if a parametric constructor is defined for a class, the parameterless constructor will
        // no be included by default, so we need to write it
    }

    public Myint(int x) {
        this.x = x;
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
