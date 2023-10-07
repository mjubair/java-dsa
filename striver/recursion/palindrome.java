import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(isPalindrome(str));
        scn.close();
    }

    static boolean isPalindromeHelper(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return isPalindromeHelper(str, left + 1, right - 1);
    }

    static boolean isPalindrome(String str) {
        return isPalindromeHelper(str, 0, str.length() - 1);
    }
}
