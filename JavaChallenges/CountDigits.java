package JavaChallenges;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long count = countDigits(number);
        System.out.println("Number of digits: " + count);
    }

    public static long countDigits(long number) {
        // Convert the number to a string and calculate its length
        return String.valueOf(number).length();
    }


    //2nd Approach
//    public static int countDigits(long number) {
//        int count = 0;
//        // Handle negative numbers by converting to positive
//        number = Math.abs(number);
//        // Count digits using a for loop
//        for (long temp = number; temp != 0; temp /= 10) {
//            count++;
//        }
//        return count;
//    }
}
