/*
* - Java always does pass-by-value. When we pass an object to a method, we are passing (by value) its memory location,
*   which means that, in the method, that parameter will be pointing to the same object as in the caller code.
*   Therefore we'll actually be able to modify the object inside the called method !
*
*   We will be able as well to simply make point the identifier in the method parameter to a new memory location
*   (with 'new') if desired. This will just change the value of the identifier of the method parameter
*   (see Fig 6.3 p.215 Pellegrino Principe Java 11).
*
*   When we use an identifier of some object in the arguments of a method call, that identifiers is first replaced
*   by it's value, which will be a memory address. Then a copy of that value is passed to the parameter in the method.
*   That's why we cannot actually modify the value of the identifier of the reference type, inside the called method.
*   In other words, we cannot make that identifier to point (memory address) to another object, inside the
*   called method. The latter would be equivalent to change the value of the identifier. If we could pass the
*   memory address where the value of the identifier is stored (which is another memory address), we could modify it,
*   effectively making that identifier to point to a newly created object. In Java this is not possible. In C/C++ it is.
*
*   More:
*   At low level, either a primitive type variable or reference type variable is nothing more than a named memory
*   location (memory location of the variable. PP p.215). A primitive type will store in that memory location an integer value,
*   for example (in binary of course). A reference type instead will store a memory address :), which will be where
*   the actual object is stored :) In Java, however, we cannot pass to a method the memory location of the variable.
*   We can only pass what that memory location has :)
*
*    See answer by Mike Nakis at
*   https://softwareengineering.stackexchange.com/questions/286008/parameters-are-passed-by-value-but-editing-them-will-edit-the-actual-object-li/286013
*
*   We can avoid modifying the object by passing a reference to a copy of it, instead. We can easily obtain a copy
*   of the object by properly defining a 'copy constructor'. Copy constructors for classes having reference type
*   fields will be more complex, as we will need to define a copy constructor for each of these types.
*
*   See Pellegrino Principe, Java 11, p. 211-215
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

    // a copy constructor
    public Myint (Myint another){
        this.x = another.x;
    }

}


public class Main {

     static void alterMyInt(final Myint myint, int newVal){
        myint.x = newVal;
    }

    public static void main (String[] args){

        Myint myint = new Myint();
        myint.x =3;

        System.out.println(myint.x);

        // pass the object by value (a reference to it) and seeing how the called method modify one of its fields
        alterMyInt(myint,5);
        System.out.println(myint.x);

        // now we pass a copy of the object, so the object in the caller code is not modified
        alterMyInt(new Myint(myint),99);
        System.out.println(myint.x);


    }



}
