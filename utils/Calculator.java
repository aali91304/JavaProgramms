package JavaChallenges.utils;

import JavaChallenges.geometry.Circle;
import JavaChallenges.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(10,5);

        double cirArea = Math.PI * Math.pow(circle.radius,2);
        double rectArea = rectangle.length * rectangle.breadth ;
       // System.out.printf("Area of  Circle is : %s , Area of Rectangle is : %s",cirArea,rectArea);
        System.out.print("Area of circle is : " + cirArea);
        System.out.println();
        System.out.print("Area of Rectangle is : " + rectArea);
    }
}
