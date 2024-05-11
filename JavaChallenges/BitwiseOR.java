package JavaChallenges;

import java.util.Scanner;

public class BitwiseOR {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Bitwise or Is : "+(num1 | num2));
    }

}
