package JavaChallenges;

public class PalindromeArray {
    public static void main(String[] args) {
        int[]numArray = ArrayUtility.inputArray();
        boolean ispalindrome = isPalindrome(numArray);
        System.out.println();
        if (ispalindrome){
            System.out.println("Your Array is Palindrome : " +ispalindrome);
        }else {
            System.out.println("Your Array is not Palindrome : "+ispalindrome);
        }

    }
    public static boolean isPalindrome(int[]numArray){
        int i = 0;
        while(i < numArray.length/2){

           if ( numArray[i] != numArray[(numArray.length-1)-i]){
               return false;
           }

            i++;
        }
        return true;
    }

}
