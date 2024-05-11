package JavaChallenges;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        int limit = 20; // Change the limit to find Pythagorean triplets up to a different limit

        System.out.println("Pythagorean Triplets up to " + limit + ":");
        printPythagoreanTriplets(limit);
    }

    public static void printPythagoreanTriplets(int limit) {
        for (int a = 1; a <= limit; a++) {
            for (int b = a + 1; b <= limit; b++) {
                for (int c = b + 1; c <= limit; c++) {
                    if (isPythagoreanTriplet(a, b, c)) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }

    public static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (a * a + b * b == c * c);
    }
}
