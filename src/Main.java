/*
 * A method can call another method and so on. Method calls can be nested almost "indefinitely". Recursion is the nothing
 * more than nested method calls, using always with the same method.
 *
 * When using a method recursively, it always must have an exit condition or base case, which is a condition that
 * returns a value or exits, instead of calling itself again. Otherwise the recursion will run indefinitely. A recursive
 * algorithm must converge to its base case.
 *
 * Recursion, as a computational algorithm, is equivalent to iteration. Any recursive algorithm can be written using
 * iterations and vice versa. The recursive approach is usually chosen when it is more natural for the problem in hand,
 * though it can be computationally more expensive due to the new memory allocation and handling, needed in each method
 * call.
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
    public Myint(Myint another) {
        this.x = another.x;
    }

}


public class Main {

    public static long factorial(final long n) {
        // This function doesn't check for positive input, neither for too large values,
        // eg. 20! is too large and cannot be stored in a long variable
        if (n == 1)
            return 1;
        else
            return n*factorial(n-1);
    }



    public static void main(String[] args) {

        long n=4;
        System.out.printf("Factorial of %d is %d: ",n, factorial(n));

    }

}
