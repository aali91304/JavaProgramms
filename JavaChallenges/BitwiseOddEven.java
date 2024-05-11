package JavaChallenges;

import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers to perform operation: ");
        int num = sc.nextInt();
        if((num & 1) ==0){
            System.out.println(num+ " is even number ");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}
