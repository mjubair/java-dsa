import java.util.Scanner;

public class recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        // printNumbersAsc(1, N);
        // printNumbersDesc(N, N);
        // printNumbersAscBackTracking(N);
        // printNumbersDescBackTracking(N);
        // printNames(N);
        // System.out.println(sumNumbers(N));
        // System.out.println(fact(N));
        System.out.print(fib(N));
        scn.close();
    }

    /*
     * print from 1 to N linearly
     */
    static void printNumbersAsc(int i, int N) {
        if (i > N)
            return;
        System.out.println(i);
        printNumbersAsc(i + 1, N);

    }

    /*
     * print from N to 1 linearly
     */
    static void printNumbersDesc(int i, int N) {
        if (i < 1)
            return;
        System.out.println(i);
        printNumbersDesc(i - 1, N);

    }

    /*
     * print from 1 to N linearly
     */
    static void printNumbersAscBackTracking(int N) {
        if (N <= 0)
            return;
        printNumbersAscBackTracking(N - 1);
        System.out.println(N);
    }

    /*
     * print from N to 1 linearly
     */
    static void printNumbersDescBackTracking(int N) {
        if (N <= 0)
            return;
        System.out.println(N);
        printNumbersDescBackTracking(N - 1);

    }

    /*
     * Print name N times
     */

    static void printNames(int N) {
        if (N <= 0)
            return;
        printNames(N - 1);
        System.out.println("Mohamed");
    }

    /*
     * Sum of first N numbers
     */

    static int sumNumbers(int N) {
        if (N == 0)
            return 0;
        return N + sumNumbers(N - 1);
    }

    /*
     * Factorial of first N numbers
     */

    static int fact(int N) {
        if (N == 1)
            return 1;
        return N * fact(N - 1);
    }

    /*
     * Fibonacci Number
     */

    static int fib(int N) {
        if (N <= 1)
            return N;
        return fib(N - 1) + fib(N - 2);
    }
}
