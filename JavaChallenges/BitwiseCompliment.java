package JavaChallenges;

import java.util.Scanner;

public class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");

        int num = sc.nextInt();
        System.out.println("Bitwise Compliment of number is :"+(~num));
    }
}
