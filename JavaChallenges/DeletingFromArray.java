package JavaChallenges;

import java.util.Scanner;

public class DeletingFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numArray = ArrayUtility.inputArray();
        System.out.println("Enter a number you want to delete  : ");
        int number = sc.nextInt();
        int[]newArray = Delete(numArray,number);
        System.out.println("Here is new Array : ");
        int i=0;
        while (i < newArray.length){
            System.out.print(newArray[i]+" ");
            i++;
        }
    }
    public static int[]Delete(int[]numArray,int number){
        int occ = NumberOfOccurence.noOfOccurences(numArray,number);
        if (occ == 0){
            return numArray;
        }
        int newsize = numArray.length-occ;
        int[]newArray = new int[newsize];
        int i = 0;
        int j = 0;
        while (i < numArray.length){
            if(numArray[i] != number){
                newArray[j]= numArray[i];
                j++;
            }
            i++;
        }

        return newArray;

    }
}
