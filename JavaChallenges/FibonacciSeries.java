package JavaChallenges;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  number of terms: ");
        int term = sc.nextInt();
        fibonacci(term);
    }

    //1st APPROACH
//    public static void fibonacci(int term){
//        if(term < 0) return;;
//        System.out.print("0 ");
//        if(term == 0) return;
//        System.out.print("1 ");
//        int first =0,second = 1;
//        while (first + second <= term){
//            int third = first + second;
//            System.out.print(third+ " ");
//            first = second;
//            second = third;
//        }
    //}

    //2nd APPROACH
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.println("fibonacci series upto " +n+ "term is :" );
        System.out.print(a+ " "+b+" ");
        for(int i =2;i<n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b= next;
        }

    }

}
