package JavaChallenges;

import java.util.Scanner;
import java.io.*;

public class CompundInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter base amount:");
        float p = sc.nextFloat();
        System.out.println("Enter Rate of interest : ");
        float r = sc.nextFloat();
        System.out.println("Enter duration : ");
        int t = sc.nextInt();

        double CI = p*(Math.pow((1 + r/ 100), t));
        System.out.println("Compund interest is : "+CI);

    }
}
