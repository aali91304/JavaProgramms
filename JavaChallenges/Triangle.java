package JavaChallenges;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height of triangle: ");
        int height = sc.nextInt();
        System.out.println("Enter breadth of triangle: ");
        int breadth = sc.nextInt();
        //int area=0;
       int area= (breadth*height)/2;
        System.out.println("Area of triangle is : "+area);
    }
}
