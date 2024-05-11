package JavaChallenges;

public class MaxMinOfArray {
    public static void main(String[] args) {
        int [] numArray = ArrayUtility.inputArray();
        int max = max(numArray);
        System.out.print("Maximum number is : " +max);
        int min = min(numArray);
        System.out.println();
        System.out.print("Minimun number is : " + min);

    }
    public static int max(int[]numArray){
        if(numArray.length==0){
            return Integer.MIN_VALUE;
        }
        int max = numArray[0];
        int i=1;
        while (i < numArray.length){
            if(max < numArray[i]){
                max = numArray[i];
            }
            i++;
        }
        return max;

    }
    public static int min(int[]numArray){
        int min = Integer.MAX_VALUE;
        int i=0;
        while (i < numArray.length){
            if (min > numArray[i]){
                min = numArray[i];
            }
            i++;
        }

        return min;
    }
}
