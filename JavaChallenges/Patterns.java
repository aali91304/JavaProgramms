package JavaChallenges;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows:");
        int rows = sc.nextInt();
        RightHalfPyramid(rows);
        ReverseRightHalfPyramid(rows);
        LeftHalfPyramid(rows);

    }
    public static void ReverseRightHalfPyramid(int mrow){
        System.out.println("here is the reverse right half pyramid : \n");
        int row = mrow;
        while (row > 0){
            int i=0;
            while (i < row){
                System.out.print(" *");
                i++;
            }


            System.out.println();
            row--;
        }

    }

    public static void RightHalfPyramid(int mrow){
        System.out.println("\n here is the right half pyramid");
        int row = 0;
        while (row < mrow){
            System.out.print("*");
            int i = 0;
            while (i< row){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }


    }
    public static void LeftHalfPyramid(int mrow){
        System.out.println("here is the left half pyramid : \n");
        int row = mrow;
        while (row > 0){
            int j = 0;
            while (j < row-1){
                System.out.print("  ");
                j++;
            }
            int i=0;
            while (i <= (mrow- row)){
                System.out.print("* ");
                i++;
            }


            System.out.println();
            row--;
        }

    }
}
