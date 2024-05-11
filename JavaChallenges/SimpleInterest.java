package JavaChallenges;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount: ");
        float p = sc.nextFloat();;
        System.out.println("Enter interest rate: ");
        float r= sc.nextFloat();
        System.out.println("Enter duration of interest: ");
        int t = sc.nextInt();
        float si = (p*r*t)/100;
        System.out.println("Simple interest of amount is: "+si);
    }
}
