import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.nextInt();
        }
        reverse(arr, 0, N - 1);
        printArray(arr, N);
        scn.close();
    }

    static void printArray(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void reverse(int[] arr, int left, int right) {
        if (left >= right)
            return;
        swap(arr, left, right);
        reverse(arr, left + 1, right - 1);
    }
}
