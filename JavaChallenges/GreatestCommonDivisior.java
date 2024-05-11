package JavaChallenges;

import java.util.Scanner;

public class GreatestCommonDivisior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number : ");
        int num2 = sc.nextInt();
        System.out.println("GCD is : "+gcd(num1,num2));
    }
    public static int gcd(int num1,int num2){
        int i=2;
        int Gcd = 1;
        int least = least(num1,num2);
        while (i<=least){
            if(num1 % i==0 && num2 % i ==0){
                Gcd = i;
            }
            i++;
        }

        return Gcd;
    }
    public static int least(int num1,int num2){
        if(num1 < num2){
            return num1;
        }else{
            return num2;
        }
    }
}
