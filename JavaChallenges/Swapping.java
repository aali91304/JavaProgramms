package JavaChallenges;

import java.util.Scanner;

//Swap two program with using third variable
public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer:");
        int num1=sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("value Before swapping:"+"num1 = "+num1 +" num2 = "+num2);

        int temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("value after swapping:");
        System.out.print("num1 = "+num1 +" num2 = " +num2);
    }

}
