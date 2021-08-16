/*
 * We pass an array to a method by passing its identifier.
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

    static void sumInts(int... intNums) {

        // The argument will actually an array
        System.out.println("Argument array size is: "+intNums.length);

        int sum = 0;
        for (int i : intNums) {
            sum += i;
        }
        System.out.println("Sum is: " + sum);
    }

    static void meanInts(int[] intNums) {

        // The argument will actually an array
        System.out.println("Argument array size is: "+intNums.length);

        int sum = 0;
        for (int i : intNums) {
            sum += i;
        }
        System.out.println("Mean is: " + sum/intNums.length);
    }

    public static void main(String[] args) {

        // An array size in Java cannot be changed after creation, so we'll not be able
        // to add new elements to the array
        int[] array1 = {1, 2, 3};
        int[] array2 = new int[]{4, 5, 6};

        int[] arrayA = new int[2];
        arrayA[0] = 4;
        arrayA[1] = 5;
        //arrayA[2] = 6; // RUNTIME ERROR!!! // ArrayIndexOutOfBoundException

        int[] array3 = new int[]{}; //we can create a zero lenght array

        //passing an array to a method
        meanInts(array1);



    }

}
