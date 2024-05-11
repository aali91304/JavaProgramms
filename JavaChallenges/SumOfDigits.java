package JavaChallenges;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digit is: "+sumOfdigit(num));
    }
    public static int sumOfdigit(int num){
        int sum =0;
        while(num > 0){
            sum = sum + (num%10);
            num = num/10;

        }
        return sum;
    }
}
