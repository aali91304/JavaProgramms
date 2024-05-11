package JavaChallenges;

public class PatternPrinter {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Factorial Pattern:");
        printFactorialPattern(rows);

        System.out.println("\nFibonacci Pattern:");
        printFibonacciPattern(rows);

        System.out.println("\nPalindrome Pattern:");
        printPalindromePattern(rows);

        System.out.println("\nPrime Pattern:");
        printPrimePattern(rows);

        System.out.println("\nOdd Pattern:");
        printOddPattern(rows);

        System.out.println("\nEven Pattern:");
        printEvenPattern(rows);

        System.out.println("\nInteger Pattern:");
        printIntegerPattern(rows);

        System.out.println("\nAlphabet Pattern:");
        printAlphabetPattern(rows);
    }

    public static void printFactorialPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(factorial(j) + " ");
            }
            System.out.println();
        }
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void printFibonacciPattern(int rows) {
        int a = 0, b = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }

    public static void printPalindromePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(isPalindrome(j) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void printPrimePattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(isPrime(j) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printOddPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * 2 - 1 + " ");
            }
            System.out.println();
        }
    }

    public static void printEvenPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * 2 + " ");
            }
            System.out.println();
        }
    }

    public static void printIntegerPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printAlphabetPattern(int rows) {
        int alphabet = 65; // ASCII value for 'A'
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (alphabet++) + " ");
            }
            System.out.println();
        }
    }
}

