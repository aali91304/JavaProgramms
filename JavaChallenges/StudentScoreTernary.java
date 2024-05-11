package JavaChallenges;

import java.util.Scanner;

public class StudentScoreTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a marks of Student : ");
        int marks = sc.nextInt();
        StudentScoreTernary score = new StudentScoreTernary();
        score.sctudentScore(marks);

    }
    public void sctudentScore(int marks){
        String category = marks  > 80 ? "High" : (marks  > 50 ? "Moderate" : "Low");
        System.out.println("Your category is  "+category);

    }
}
