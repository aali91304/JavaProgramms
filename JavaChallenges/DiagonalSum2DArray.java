package JavaChallenges;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        int[][]numArray = ArrayUtility.input2DArray();
        System.out.println("Array is : ");
        ArrayUtility.display2DArray(numArray);
        long sum = sumOfDiagonals(numArray);
        System.out.println();
        System.out.print("Sum of Diagonals is : "+sum);
    }
    public static long sumOfDiagonals(int[][]numArray){
        long leftSum = sumOfLeftDiagonals(numArray);
        long rightSum = sumOfRightDiagonals(numArray);

        long sum = leftSum+rightSum;
        if(numArray.length % 2 != 0){
            int ind = numArray.length /2;
            sum -= numArray[ind][ind];
        }


        return  sum;
    }
    public static long sumOfLeftDiagonals(int[][]numArray){
       long sum=0;
       int i =0;
        while (i < numArray.length){
            sum+= numArray[i][i];
            i++;
        }

        return  sum;
    }
    public static long sumOfRightDiagonals(int[][]numArray){
        long sum = 0;
        int  i = 0;
        while (i < numArray.length){
            int j = numArray.length-1-i;
            sum+=numArray[i][j];
            i++;
        }

        return  sum;
    }
}
