package JavaChallenges;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation (+, -, *, /): ");
        String operation = sc.next();
        CalculatorSwitch ans = new CalculatorSwitch();


       ans.calculator(num1,num2,operation);
    }
    public  void calculator(int num1,int num2,String operation){
        int result = switch (operation){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            default -> -1;
        };
        System.out.println("Your result is : "+ result);

    }
}
