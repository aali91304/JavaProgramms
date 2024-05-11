package JavaChallenges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter elements in the array : ");
        int i=0;

        while (i < size) {
            System.out.print("Enter element no " +(i+1)+ " : ");
            nums[i] = sc.nextInt();
            i++;
        }



        System.out.println();

        // Displaying the array elements
        System.out.print("Array is : ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println(); // For a newline

        return nums;
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row And Column : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements in the array : ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter row " + (i + 1) + " : " + " Column" + (j + 1) + " : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        return arr;
    }
    public static void display2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
