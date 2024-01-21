/*
Student: Calvin Chaparro
Class: CEN-4802C
Professor: Ian O'Toole
 */

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
        //seq21 + 34 = 55
    }
}