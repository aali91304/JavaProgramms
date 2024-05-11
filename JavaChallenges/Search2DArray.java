package JavaChallenges;

import java.util.Scanner;

public class Search2DArray {
    public static void main(String[] args) {

        int[][]arr = ArrayUtility.input2DArray();
        System.out.println("Array is : ");
        ArrayUtility.display2DArray(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");

        int num =sc.nextInt();
        boolean isFound = search(arr,num);
        if(isFound){
            System.out.println("You element is present in this Array: ");
        }else {
            System.out.println("Element is not present");
        }
    }
    public static boolean search(int[][]numArray,int num){
        int i=0;

        while(i < numArray.length){
            int j=0;
            while (j < numArray[i].length){
                if(numArray[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;

    }

}
