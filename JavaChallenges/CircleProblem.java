package JavaChallenges;

import java.util.Scanner;

public class CircleProblem {
    double radius;

    public CircleProblem(double radius) {
        this.radius = radius;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
     double getArea(){
        return Math.PI* Math.pow(radius,2);
     }

    @Override
    public String toString() {
        return "CircleProblem : Radius in cm : " + radius+",Circumference in cm :" + getCircumference()+", Area in cm2 :"+ getArea();

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a radius of Circle : ");
        double radius = sc.nextDouble();
        CircleProblem circle = new CircleProblem(radius);
        System.out.println(circle);

    }
}
