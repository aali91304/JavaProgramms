package JavaChallenges;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(primenumber(num));
    }
    public static boolean primenumber(int num){
        int i =2;
        while(i<num){
            if(num % i ==0){
                return false;
            }
            i++;

        }
        return true;
    }
}
