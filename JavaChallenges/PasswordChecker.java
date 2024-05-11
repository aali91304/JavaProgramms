package JavaChallenges;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Password;
        do{
            System.out.println("Enter your password");
            Password =  sc.nextLine();

        }while (! isValidPassword(Password));
        System.out.println("Your Password is valid : ");


    }
    public static boolean isValidPassword(String Password){

        return Password.length() > 6;
    }
}
