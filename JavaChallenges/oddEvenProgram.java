package JavaChallenges;

import java.util.Scanner;

public class oddEvenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 100 : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + " is even number.");
        }
        else {
            System.out.println(num + " is odd number.");

        }
    }
}
