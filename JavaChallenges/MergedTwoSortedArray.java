package JavaChallenges;

public class MergedTwoSortedArray {
    public static void main(String[] args) {
        int[]arr1 = ArrayUtility.inputArray();
        int[]arr2 = ArrayUtility.inputArray();
        System.out.println("Merged Array is : ");
        int[]mergedArray = mergedArray(arr1,arr2);
        display(mergedArray);

    }
    public static int[]mergedArray(int[]arr1,int[]arr2){
        int newsize = arr1.length + arr2.length;
        int[]newArray = new int[newsize];

        int i =0; int j=0;int k=0 ;
        while (i < arr1.length || j < arr2.length){
            if(j==arr2.length || (i< arr1.length && arr1[i] < arr2[j])){
                newArray[k]=arr1[i];
                i++;
                k++;
            }else {
                newArray[k] = arr2[j];
                j++;
                k++;
            }

        }
        return newArray;

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
