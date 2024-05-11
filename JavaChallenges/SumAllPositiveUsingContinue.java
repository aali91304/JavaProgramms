package JavaChallenges;

import java.util.Scanner;

public class SumAllPositiveUsingContinue {
    public static void main(String[] args) {

        int[]numArray = ArrayUtility.inputArray();
        int sum =0;
        for(int num : numArray){
            if(num < 0){
                continue;
            }
            sum+= num;
        }
        System.out.println("Sum of positive number is : "+ sum);

    }
}
