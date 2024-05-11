package JavaChallenges;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age <=13){
            System.out.println("You are child");
        } else if (age > 13 && age <= 20) {
            System.out.println("You are a teen ager :");
            
        } else if (age > 20 && age <= 60) {
            System.out.println("You are Adult ");
            
        } else if (age > 60 && age <= 90) {
            System.out.println("YOU are a senior citizen ");

        }else {
            System.out.println("Ab jine ki umeed chhod do tum...!");
        }
    }
}
