package JavaChallenges;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        int guess;
        System.out.println("Welcome ! ");
        do{
            System.out.println("Please guess the number between  0 to 100 :");
            guess = sc.nextInt();

        }while (a != guess);
        System.out.println("you have successfully guessed the number : ");
    }
}
