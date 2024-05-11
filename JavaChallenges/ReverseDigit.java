package JavaChallenges;

class Solution{
    public long reverse_digit(long n){
        long rem = 0;
        long rev = 0;
        while(n >0){
            rem =n % 10;
            rev = rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
public class ReverseDigit {
    public static void main(String[] args) {
        Solution s= new Solution();

        int num =12345;
        System.out.print("originl number is : "+ num);
        System.out.println();
        System.out.println("Reverse number is : "+ s.reverse_digit(num));
    }

}
