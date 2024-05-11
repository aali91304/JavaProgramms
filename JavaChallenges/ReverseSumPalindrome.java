package JavaChallenges;

class solve {
//    static long reverse(long n) {
//        long rev = 0;
//        while (n > 0) {
//            rev = rev * 10 + n % 10;
//            n /= 10;
//        }
//        return rev;
//    }
//
//    static boolean isPalindrome(long n) {
//        long original = n;
//        long rev = reverse(n);
//        return original == rev;
//    }
//
//    static long isSumPalindrome(long n) {
//        long sum = n;
//        long revSum = reverse(sum);
//        while (!isPalindrome(sum)) {
//            sum += revSum;
//            revSum = reverse(sum);
//        }
//        return sum;
//    }
static int isDigitSumPalindrome(int n){
        int sum =0;
        while(n > 0){
            sum += (n%10);
            n/=10;
        }
        return isPalindrome(sum) ?1 :0;
    }
   static boolean isPalindrome(int n){
        int original =n;
        int rev =0;
        while(n >0){
            int rem = n % 10;
            rev = rev*10+rem;
            n/=10;
        }
        return original==rev;
    }
}

public class ReverseSumPalindrome {
    public static void main(String[] args) {
        int num1 = 65;
        System.out.println(solve.isDigitSumPalindrome(num1));
    }
}
