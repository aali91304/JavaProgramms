package JavaChallenges;

import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from which you want to perform operation: ");

        int num = sc.nextInt();
        System.out.println("Bitwise Rightt SHift is :"+(num>>2));
    }
}
