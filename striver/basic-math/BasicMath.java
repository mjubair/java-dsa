import java.util.Scanner;

/*
 * Step 1.4 of strivers-a2z-dsa-course/
 * https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
 */

public class BasicMath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int M = scn.nextInt();
        gcd2(N, M);
        scn.close();
    }

    /*
     * Counting number of digtis
     * using iteration
     */
    static void countDigits1(int N) {
        int count = 0;
        while (N != 0) {
            count++;
            N = N / 10;
        }
        System.out.print(count);
    }

    /*
     * Counting number of digits
     * using string conversion
     */
    static void countDigits2(int N) {
        String num = Integer.toString(N);
        System.out.print(num.length());
    }

    /*
     * Counting number of digits
     * using math function
     */
    static void countDigits3(int N) {
        int count = (int) Math.floor(Math.log10(N)) + 1;
        System.out.print(count);
    }

    /*
     * Reverse a number
     */
    static void reverse(int N) {
        int reverse = 0;
        while (N != 0) {
            int lastDigit = N % 10;
            reverse = (reverse * 10) + lastDigit;
            N = N / 10;
        }
        System.out.print(reverse);
    }

    /*
     * Check if the given number is a palindrome
     */
    static void palindrome(int N) {
        int num = N;
        int reverse = 0;
        while (N != 0) {
            int lastDigit = N % 10;
            reverse = (reverse * 10) + lastDigit;
            N = N / 10;
        }
        if (num == reverse) {
            System.out.print("Palindrome Number");
        } else {
            System.out.print("Not Palindrome Number");
        }
    }

    /*
     * Check if the given number is an Armstrong number
     */
    static void armstrong(int N) {
        int num = N;
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum += lastDigit * lastDigit * lastDigit;
            num = num / 10;
        }
        if (sum == N) {
            System.out.print("Yes, it is an Armstrong Number");
        } else {
            System.out.print("No, it is not an Armstrong Number");
        }
    }

    /*
     * Print all divisors of a given number
     * Brute force approach
     * TC -> O(N)
     * SP -> O(1)
     */
    static void divisors(int N) {
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    /*
     * Print all divisors of a given number
     * Optimized approach
     * TC -> O(sqrt(N))
     * SC -> O(1)
     */
    static void divisorsOptimized(int N) {
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + ", ");
                if (i != N / i)
                    System.out.print(N / i + ", ");
            }
        }
    }

    /*
     * Check for prime numbers
     * Brute force approach
     * TC -> O(N) | SC -> O(1)
     */

    static void isPrime1(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(N + ", is a prime number");
        } else {
            System.out.println(N + ", is not a prime number");
        }
    }

    /*
     * Check for prime numbers
     * Optimized approach
     * TC -> O(sqrt(N)) | SC -> O(1)
     */

    static void isPrime2(int N) {
        int count = 0;
        for (int i = 1; i * i < N; i++) {
            if (N % i == 0) {
                count++;
                if (N / i != i) {
                    count++;
                }
            }
        }

        if (count == 2) {
            System.out.println(N + ", is a prime number");
        } else {
            System.out.println(N + ", is not a prime number");
        }
    }

    /*
     * Greatest Common Divisor or Highest Common Factor
     * Brute force optimized as we are reversing the loop
     * TC -> O(N) | SC -> O(1)
     */

    static void gcd1(int N, int M) {
        for (int i = Math.min(N, M); i >= 1; i--) {
            if (N % i == 0 && M % i == 0) {
                System.out.print(i);
                return;
            }
        }
    }

    /*
     * Greatest Common Divisor or Highest Common Factor
     * Using Euclidean Algorithm
     * TC -> O(N) | SC -> O(1)
     */

    static void gcd2(int N, int M) {
        while (N > 0 && M > 0) {
            if (N > M)
                N = N % M;
            else
                M = M % N;
        }
        if (N == 0)
            System.out.print(M);
        else
            System.out.print(N);
    }

}
