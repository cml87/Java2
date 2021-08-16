/*
 * In Java multidimensional arrays can be irregular, ie. the size of each dimension can be different.
 *  We pass such array to a method by passing its identifier, as for 1D arrays
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

    static void array2Dmax(int[][] data) {

        int max = 0;
        for (int r = 0; r < data.length; r++) {
            for (int k = 0; k < data[r].length; k++) {
                max = data[r][k] > max ? data[r][k] : max;
            }
        }

        System.out.println("Max is: " + max);
    }

    public static void main(String[] args) {

        // An irregular 2D array
        int[][] data = {
                {1, 2, 3},
                {8, 9},
                {5, 8, 9, 6, 3}
        };

        array2Dmax(data);
    }

}
