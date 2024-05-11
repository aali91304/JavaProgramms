package JavaChallenges;

import java.util.Scanner;

public class NumberSigned {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to recognize the number: ");
        System.out.println("Please enter the number which you want to recognize");
        int num = sc.nextInt();
        boolean isPositive = true;

        boolean isNegative = true;
        if(isPositive && num > 0){
            System.out.println(num + "is positive number");
        } else if (isNegative && num < 0) {
            System.out.println(num + "is negative");

        }
        else{
            System.out.println(num + "equals to zero.");
        }
    }
}
