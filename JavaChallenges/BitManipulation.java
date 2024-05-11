package JavaChallenges;

public class BitManipulation {
    public static void main(String[] args) {
        int num1 = 5; // Binary representation: 101
        int num2 = 3; // Binary representation: 011

        // Bitwise AND
        int resultAnd = num1 & num2;
        System.out.println("Bitwise AND of " + num1 + " and " + num2 + " is: " + resultAnd); // Output: 1

        // Bitwise OR
        int resultOr = num1 | num2;
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + resultOr); // Output: 7

        // Bitwise XOR
        int resultXor = num1 ^ num2;
        System.out.println("Bitwise XOR of " + num1 + " and " + num2 + " is: " + resultXor); // Output: 6

        // Bitwise NOT
        int resultNotNum1 = ~num1;
        System.out.println("Bitwise NOT of " + num1 + " is: " + resultNotNum1); // Output: -6

        // Left Shift
        int resultLeftShift = num1 << 1;
        System.out.println("Left Shift of " + num1 + " by 1 is: " + resultLeftShift); // Output: 10

        // Right Shift
        int resultRightShift = num1 >> 1;
        System.out.println("Right Shift of " + num1 + " by 1 is: " + resultRightShift); // Output: 2

        // Unsigned Right Shift
        int num3 = -5; // Binary representation: 11111111111111111111111111111011
        int resultUnsignedRightShift = num3 >>> 1;
        System.out.println("Unsigned Right Shift of " + num3 + " by 1 is: " + resultUnsignedRightShift); // Output: 2147483645
    }
}
