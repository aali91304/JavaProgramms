package JavaChallenges;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number :");
        int num3 = sc.nextInt();

        int lcmOfTwo = lcm(num1, num2);
        System.out.println("LCM of the two number is : "+lcm(num1,num2));

        int lcmOfThree = lcm(lcmOfTwo, num3);

        System.out.println("LCM of the three numbers is : " + lcmOfThree);



    }

    public static int lcm(int num1,int num2) {
        int i=1;
        while(true){
            int factor = num1 *i;
            if(factor % num2 ==0){
                return factor;
            }

            i++;
        }


       // return 0;
    }
}





//public class LCM {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter first number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Enter second number: ");
//        int num2 = scanner.nextInt();
//
//        int lcm = calculateLCM(num1, num2);
//
//        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
//
//        scanner.close();
//    }
//
//    public static int calculateLCM(int num1, int num2) {
//        int lcm = (num1 > num2) ? num1 : num2;
//
//        while (true) {
//            if (lcm % num1 == 0 && lcm % num2 == 0) {
//                break;
//            }
//            lcm++;
//        }
//        return lcm;
//    }
//}
