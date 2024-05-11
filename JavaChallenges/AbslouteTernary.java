package JavaChallenges;

import java.util.Scanner;

public class AbslouteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int num = sc.nextInt();

        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is : " +result);
    }
}
