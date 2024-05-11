package JavaChallenges;

import java.util.Scanner;

public class ProductFloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating variable: ");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Product of two floating variable i : "+(num1*num2));
    }
}
