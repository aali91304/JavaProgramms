package JavaChallenges;

public class ReverseArray {
    public static void main(String[] args) {
        int[]numArray = ArrayUtility.inputArray();

        reverseArray(numArray);
        System.out.println("Reversed Array is : ");
        display(numArray);

    }
    public static void reverseArray(int[]numArray){
        int i = 0;
        int rev =0;
        while(i < numArray.length/2){
            rev = numArray[i];
            numArray[i] = numArray[(numArray.length-1)-i];
            numArray[(numArray.length-1)-i] = rev;
            i++;
        }

    }
    public static void display(int[]numArray){
        int i=0;
        while (i < numArray.length){
            System.out.print(numArray[i]+" ");

            i++;
        }
        return;
    }
}
