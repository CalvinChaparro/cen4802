/*
Student: Calvin Chaparro
Class: CEN-4802C
Professor: Ian O'Toole
 */

/**
 * The Fibonacci class contains the methods necessary for calculating the Fibonacci sequence.
 */
public class Fibonacci {

    /**
     * Calculates the n-th term in the Fibonacci sequence using recursion method.
     *
     * @param n The position of the term to calculate (must be a positive integer).
     * @return The n-th term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * Main method demonstrates the Fibonacci calculation.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);

        // Outputs result
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
        //seq21 + 34 = 55
    }
}
