package JavaChallenges;

import java.util.Scanner;

public class gradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to student grade calculator :");
        System.out.println();
        System.out.println("Enter a name of student:");
        String name = sc.nextLine();
        System.out.println("enter roll number of student: ");
        int rollnumber = sc.nextInt();
        System.out.println("Enter class of student :");
        int Class = sc.nextInt();
        System.out.println("enter five subject marks");
        int physics = sc.nextInt();
        ;
        int chemistry = sc.nextInt();
        ;
        int biology = sc.nextInt();
        ;
        int hindi = sc.nextInt();
        int english = sc.nextInt();


        System.out.println("Student name is : " + name + " rollnumber is : " + rollnumber + " class is : " + Class);
        System.out.println("Marks of five subjects out of 100 are : ");
        System.out.println("Physics : " + physics + "\n" + "chemistry : " + chemistry + "\n" + "biology : " + biology + " \n" + "hindi : " + hindi + "\n" + "english : " + english);
        int max_marks = 500;
        int total_marks = physics + chemistry + biology + hindi + english;
        System.out.println("total marks is: " + total_marks);
        double percentage = (total_marks *100/ max_marks) ;
        System.out.println("Percentage is : " + percentage);
        if(percentage >= 90){
            System.out.println("you got A");
        }else if ( percentage < 90 && percentage >= 75){
            System.out.println("you got grade B");
        }else if(percentage < 75 && percentage >= 60){
            System.out.println("you got C");
        }else {
            System.out.println("Fail");
        }
    }
}

