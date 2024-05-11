package JavaChallenges;

import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Original number is : "+ num);
        System.out.println("Rverse Digit is : "+digitreverse(num));

    }
    public static  int digitreverse(int num){
        int rev = 0;
        int rem =0;
        while (num > 0){
            rem = num % 10;
            rev = rev*10+rem;
            num/=10;
        }
        return rev;
    }
}
