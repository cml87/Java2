/*
* - use clause 'throws' if the method throws checked exceptions, ie. those that are NOT subclasses of RuntimeException
*   Exceptions being subclasses of RuntimeExceptions are called unchecked exceptions and are handled automatically
*   by the JVM. But we can handle them if desired as well.
*   RuntimeException is the superclass of all unchecked exceptions.
*   With clause throws we specify reference types that are assignment compatible with the exceptions our method could
*   throw.
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
