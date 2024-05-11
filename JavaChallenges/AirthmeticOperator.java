package JavaChallenges;
import java.util.Scanner;
public class AirthmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  two integer variable : ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        //Addition
        int sum = num1+num2;
        System.out.println("sum is : "+sum);
        //Substracton
        int minus = num2-num1;
        System.out.println("substraction is : "+minus);
        //Multiplication
        int multiply = num1*num2;
        System.out.println("multiplication is :"+multiply);
        //division
        int div=num2/num1;
        System.out.println("division is :"+div);
        //modulus
        int mod = num2 % num1;
        System.out.println("modulus is :"+mod);

    }
}


