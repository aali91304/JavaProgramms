package JavaChallenges;

import java.util.Scanner;

public class NumberOfOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []numArray = ArrayUtility.inputArray();
        System.out.println("Enter the number you want to find it : ");
        int target = sc.nextInt();
        int occurences =  noOfOccurences(numArray,target);
        System.out.println("element was found "+ occurences+ " times in the array. ");
    }
    public static  int noOfOccurences(int[]numArray,int target){
        int count =0;
        int i=0;
        while(i < numArray.length){
            if(numArray[i]==target){
             count++;
            }
            i++;
        }
        return count;

    }
}
