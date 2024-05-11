package JavaChallenges;

public class IsSortedArray {
    public static void main(String[] args) {
        int[]numArray = ArrayUtility.inputArray();
        boolean isInc = Assending(numArray);
        boolean isDec = Desendig(numArray);
        if(isInc){
            System.out.println("NUmber is sorted in : Assending Order :  " + isInc);
        } else if (isDec) {
            System.out.println("NUmber is sorted in : Dessending Order :  " + isDec);

        }else {
            System.out.println("number is not sorted.");
        }

    }
    public static boolean Assending(int[]numArray){
        int i = 1;
        while (i < numArray.length){
            if(numArray[i] < numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static  boolean Desendig(int[]numArray){
        int i= 1;
        while (i < numArray.length){
            if(numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
