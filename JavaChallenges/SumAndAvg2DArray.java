package JavaChallenges;

public class SumAndAvg2DArray {
    public static void main(String[] args) {
        int[][]numArray = ArrayUtility.input2DArray();
        System.out.println("Array is : ");
        ArrayUtility.display2DArray(numArray);
        System.out.print("Sum of 2D Array is : " +sum(numArray));
        System.out.println();
        System.out.print("Average of 2D Array is : " +avg(numArray));
    }
    public static long sum(int[][]numArray){
        int sum =0;
        int i =0;
        while (i < numArray.length){
            int j=0;
            while (j < numArray[i].length){
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static double avg(int[][]numArray){
        int i=numArray.length;
        int j= numArray[0].length;
        double size = i * j;
        double avg = sum(numArray)/size;

        return  avg;
    }
}
