package JavaChallenges;

import java.util.Scanner;

public class PalindromeBinary {
    static long isPalindrome(int n){
        String binary = Long.toBinaryString(n);
        int left =0;
        int right= binary.length()-1;
        while (left < right){
            if(binary.charAt(left) != binary.charAt(right))
                return  0;
            left++;
            right--;

        }
        return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(PalindromeBinary.isPalindrome(num1));
        int num2 = sc.nextInt();
        System.out.println(PalindromeBinary.isPalindrome(num2));
    }
}
