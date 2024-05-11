package JavaChallenges;

import java.util.Scanner;

public class TempratureConvertor {
    public static void main(String[] args) {

        //C = (F-32)*5/9
        //fahrenheit=(celsius*1.8)+32

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature in Farenheit: ");
        double F = sc.nextDouble();
        double C = (F - 32)*5/9;
        System.out.println("Temprature  is in degree : "+C);

    }
}
