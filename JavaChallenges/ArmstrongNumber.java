package JavaChallenges;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//import static java.lang.Math.pow;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num1 = sc.nextInt();
       // boolean isArmstrong =
                System.out.println( isArmstrong(num1));
                int num2 = sc.nextInt();
              System.out.println(isArmstrong(num2));
//        if(isArmstrong){
//            System.out.println("You number is Armstrong");
//        }else {
//            System.out.println("Your number is not Armstrong.");
//        }

    }
//    public static boolean isArmstrong(int num){
//        int numCopy =num;
//        int Ndigit = noOfDigits(num);
//        int finalNumber = 0;
//        while (num > 0){
//            int lastDigit = num % 10;
//            num/=10;
//            finalNumber+= pow(lastDigit,Ndigit);
//            System.out.println(" number is : "+ finalNumber+" ");
//
//        }
//        return finalNumber==numCopy;
//    }
//    public static  int pow(int num1,int num2){
//        int result=1;
//        int i=0;
//        while (i < num2){
//            result*= num1;
//            i++;
//            System.out.println("power is :  " +result);
//        }
//        return result;
//
//    }
//    public static int noOfDigits(int num){
//        int digits = 0;
//        while (num > 0){
//            digits++;
//            num/=10;
//
//        }
//        System.out.println("number of digit is : " +digits);
//        return digits;
//    }
    public static  boolean isArmstrong(int n){
        int num =n;
        int sum =0;
        while(n >0){
            int digits = n %10;
            sum+= Math.pow(digits,3);
            n/=10;

        }
        if(sum ==num){
            return true;
        }
        return false;
    }


}
