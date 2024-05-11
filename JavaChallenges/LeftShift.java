package JavaChallenges;

import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from which you want to perform operation: ");

        int num = sc.nextInt();
        System.out.println("Bitwise Left SHift is :"+(num<<2));
    }
}
