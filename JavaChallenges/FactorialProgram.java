package JavaChallenges;

public class FactorialProgram {
//    public static void factorial(int N){
//        if(N == 0){
//            return;
//        }
//        int i =1;
//        int fact =1;
//        while (i <=N){
//            fact *= i;
//            i++;
//        }
//        System.out.println("factorial of"+ N+ "is : "+ fact );
//    }
//
//    public static void main(String[] args) {
//        factorial(5);
//    }
    static int fact(int n){
        if(n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("FActorial of a number is : "+fact(5));
    }
}
