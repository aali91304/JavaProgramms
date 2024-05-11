package JavaChallenges;


public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        System.out.println("Half Pyramid - Upper Left:");
        printHalfPyramidUpperLeft(rows);

        System.out.println("\nHalf Pyramid - Upper Right:");
        printHalfPyramidUpperRight(rows);

        System.out.println("\nHalf Pyramid - Lower Left:");
        printHalfPyramidLowerLeft(rows);

        System.out.println("\nHalf Pyramid - Lower Right:");
        printHalfPyramidLowerRight(rows);

        System.out.println("\nFull Pyramid - Upper:");
        printFullPyramidUpper(rows);

        System.out.println("\nFull Pyramid - Lower:");
        printFullPyramidLower(rows);

        System.out.println("\nDiamond:");
        printDiamond(rows);

        System.out.println("\nHollow Square:");
        printHollowSquare(rows);
    }

    public static void printHalfPyramidUpperLeft(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHalfPyramidUpperRight(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHalfPyramidLowerLeft(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHalfPyramidLowerRight(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= rows; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printFullPyramidUpper(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printFullPyramidLower(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printDiamond(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHollowSquare(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
