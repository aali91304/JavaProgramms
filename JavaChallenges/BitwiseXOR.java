package JavaChallenges;

import java.util.Scanner;

public class BitwiseXOR {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter two numbers :");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Bitwise XOR is : "+(num1 ^ num2));
    }
}
