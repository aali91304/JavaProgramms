package JavaChallenges;

import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {

       int[]num = ArrayUtility.inputArray();
        System.out.print("sum of Array is : "+ sum(num));
        System.out.println();
        System.out.print("Average of an Array is : " + average(num));



    }
    public static long sum(int[]num){
        int sum =0;
        int i =0;
        while (i < num.length){
            sum+=num[i];
         i++;
        }
        return (int)(sum);
    }
    public static int average(int[]num){
        int sum=(int)sum(num);
        return (sum/num.length);
    }



}
