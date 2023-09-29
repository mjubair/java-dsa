import java.util.Scanner;


/*
 * https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 */

public class patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        pattern10(N);
        scn.close();
    }

    static void pattern1(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int N) {
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i -1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern9(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern10(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}

