package JavaChallenges;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month number : ");
        int number = sc.nextInt();
        String month = getMonth(number);

        System.out.println("Your month is : "+ month);
    }
    public static String getMonth(int number){
        String month = switch(number){
            case 1  -> "January";
            case 2  -> "February";
            case 3  -> "March";
            case 4  -> "April";
            case 5  -> "May";
            case 6  -> "June";
            case 7  -> "July";
            case 8  -> "August";
            case 9  -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default ->  "Invalid month number";



        };
        return month;

    }
}
