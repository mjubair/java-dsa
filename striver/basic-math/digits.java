import java.util.Scanner;

public class digits {
     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        countDigits3(N);
        scn.close();
    }

    /*
     * Counting number of digtis 
     * using iteration
     */
    static void countDigits1(int N) {
        int count = 0; 
        while(N!=0) {
            count++;
            N = N/10;
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
        int count = (int)Math.floor(Math.log10(N)) + 1;
        System.out.print(count);
    }
    
}
