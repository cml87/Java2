/*
*
* Members of JAVA	    Private	 Default	 Protected	Public
*           Class	    No	     Yes         No	        Yes
*           Variable	Yes	     Yes	     Yes    	Yes
*           Method  	Yes  	 Yes	     Yes	    Yes
*           Constructor	Yes	     Yes	     Yes    	Yes
*           interface	No	     Yes         No     	Yes
*
*
*  Allowed access modifiers for different Java things are shown above.
*  As can be seen, classes and interfaces (things that can be used to reference objects) can't be neither Private
*  nor Protected !
*
*  Nested classes can be provate or protected though, but I haven't seen any example on it.
*
*  See https://www.mygreatlearning.com/blog/the-access-modifiers-in-java/
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
