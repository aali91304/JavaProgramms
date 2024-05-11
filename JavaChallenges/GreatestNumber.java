package JavaChallenges;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number which you want to compare :");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 > num2 && num2 > num3){
            System.out.println(num1 + " is greatest number");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println(num2 + " is greatest number");

        } else{
            System.out.println(num3 + " is greatest number ");
        }
    }
}
