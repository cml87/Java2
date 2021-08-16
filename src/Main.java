/*
 * Java supports variable length arguments for methods, with the syntax "<type> ..." This is syntactic sugar though.
 * The compiler translates the parameter into an array of the corresponding type.
 * The variable length parameter must be the last defined in the parameters list of the method.
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

    static void sumIntsOffset(int offSet, int... intNums) {
        int sum = 0;
        for (int i : intNums) {
            sum += i;
        }
        System.out.println("Sum is: " + (sum - offSet));
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
        System.out.printf("Size of array3 is: %d\n\n", array3.length);

        sumInts(array1);
        sumInts(4, 6);
        sumInts();  // an array of length 0 will be created inside the sumInt() method

        System.out.println("Method with offset:");
        sumIntsOffset(6, 1, 2, 3);

    }

}
