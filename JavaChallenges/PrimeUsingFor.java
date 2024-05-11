package JavaChallenges;

import java.util.Scanner;

public class PrimeUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrimeUsingFor prime = new PrimeUsingFor();

       if( prime.isPrime(num)){
           System.out.println("Your number is Prime :");
       }else{
           System.out.println("Your number is not prime :");
       }


    }
    public boolean isPrime(int num){
        for(int i =2; i< num;i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;

    }
}
