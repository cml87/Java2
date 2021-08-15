/*
* Functions, procedures, subroutines, methods : different names in different languages
*
* Classes and their members (methods and fields) can have different modifiers.
* Access modifiers for methods: public, protected, private
* Other modifiers for methods: abstract, static, final, synchronized, native, strictfp.
* public: method callable from any class
* private: only from inside same class
* protected: from same package or subclasses in other packages
* default (when nothing is specified) from same package
*
*  For abstract, static or final we just decide whether or not to use them, thus imposing some additional
*  characteristics of the method. For example, a static vs a non-static method.
*
* - Void is not a type, so we cannot make cast to void.
* - Method names have the same restrictions as for variables and class names
* - 'parameters' is for methods definitions 'arguments' is for methods calls
* - variables in method parameters are local to the method.
* - a method parameter can be 'final' , which means it cannot be reassigned again in the method body
*
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
