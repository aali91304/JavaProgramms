package JavaChallenges;

import java.util.Scanner;

public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be checked : ");
        String str = sc.next();
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }


    }
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false; // If not equal, it's not a palindrome
        }
        return isPalindrome(str, start + 1, end - 1);
    }

}

