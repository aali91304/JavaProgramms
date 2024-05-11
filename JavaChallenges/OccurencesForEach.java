package JavaChallenges;

import java.util.Scanner;

public class OccurencesForEach {
    public static void main(String[] args) {
        int[]arr = ArrayUtility.inputArray();
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element :");
        int target = sc.nextInt();

        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        System.out.println("element was found "+ count+ " times in the array. ");


    }
}
