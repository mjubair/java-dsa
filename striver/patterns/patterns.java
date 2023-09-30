import java.util.Scanner;


/*
 * https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/
 */

public class patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        pattern18(N);
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

    static void pattern11(int N) {
        for(int i = 0; i < N; i++) {
            int digit = i % 2 == 0 ? 1 : 0;
            for(int j = 0; j <= i; j++) {
                System.out.print(digit + " ");
                // digit = digit == 0 ? 1 : 0;
                digit = 1 - digit;
            }
            System.out.println();
        }
    }

    static void pattern12(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            // (N-i-1) + (N-i-1) ==> 2*(N-i-1)
            for(int j = 0; j < 2*(N - i - 1); j++) {
                System.out.print("  ");
            } 
            // for(int j = 0; j < N - i - 1; j++) {
            //     System.out.print("_ ");
            // } 
            for(int j = i+1; j > 0; j--) {
                System.out.print(j + " ");
            }
            // for(int j = 0; j <= i; j++) {
            //     System.out.print(i + 1 - j + " ");
            // }
            System.out.println();
        }
    }

    static void pattern13(int N) {
        int count = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(++count + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int N) {
        for(int i = 0; i < N; i++) {
            // for(int j = 0; j <= i; j++) {
            //     System.out.print((char)(65+j) + " ");
            // }
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern15(int N) {
        for(int i = 0; i < N; i++) {
            for(char ch = 'A'; ch <= 'A'+N-i-1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    static void pattern16(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print((char)('A' + i) + " ");
            }
            System.out.println();
        }
    }

    static void pattern17(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i - 1; j++) {
                System.out.print("  ");
            }
            for(char ch = 'A'; ch < 'A' + i+1; ch++) {
                System.out.print(ch + " ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print((char)('A' + i - j - 1)  + " ");
            }
            System.out.println();
        }
    }

    static void pattern18(int N) {
        for(int i = 0; i < N; i++) {
            char ch = (char)('A'+N-i-1);
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(ch+j) + " ");
            }
            System.out.println();
        }
    }

    static void pattern19(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < i*2; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < N-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(N-i-1); j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern20(int N) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(N-i-1); j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N-i-1; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(i+1); j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < N-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern21(int N) {
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                if(i == 0 || j == 0 || i == N-1 || j == N-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();   
        }
    }

    /*
     * Initial approach:
     * Seperate problem into top and bottom half
     * for the top half print right triangle, equilatral triangle, and inverted right triangle
     * for the bottom half print right triangle, equilatral triangle, and inverted right triangle
     */

    // static void pattern22(int N) {
    //     for(int i = 0; i < N; i++) {
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print(N-j+1 + " ");
    //         }
    //         for(int j = 0; j < (2*N)-(2*i)-1; j++) {
    //             System.out.print(N-i + " ");
    //         }
    //         for(int j = 1; j <= i; j++) {
    //             System.out.print(N-i+j + " ");
    //         }
    //         System.out.println();
    //     }
    //     for(int i = 1; i < N; i++) {
    //         for(int j = 1; j <= N-i-1; j++) {
    //             System.out.print(N-j+1 + " ");
    //         }
    //         for(int j = 0; j < 2*(i+1)-1; j++) {
    //             System.out.print(i+1 + " ");
    //         }
    //         for(int j = 1; j <= N-i-1; j++) {
    //             System.out.print(i+j+1 + " ");
    //         }
    //         System.out.println();
    //     }   
    // }

    /*
     * Better Approach
     * find the distance between each side and 
     * take the min distance from all four sides
     */
    static void pattern22(int N) {
        for(int i = 0; i < (2*N)-1; i++) {
            for(int j = 0; j < (2*N)-1; j++) {
                int top = i;
                int left = j;
                int bottom = (2*N)-2-i;
                int right = (2*N)-2-j;
                int num = Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(N - num);
            }
            System.out.println();
        }
    }

}

