package JavaChallenges;

public class PatternsChallenges {
    public static void main(String[] args) {

        //RIGHT HALF PYRAMID

//        for(int i=0;i<5;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

       //REVERSE RIGHTHALF PYRAMID
//        for(int i=5;i>0;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //LEFT HALF PYRAMID
        for(int i=0;i<=5;++i){
            for(int j=0;j<(5-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
