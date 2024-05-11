package JavaChallenges;

public class EvenContinue {
    public static void main(String[] args) {
        int[]numArray = ArrayUtility.inputArray();

        for(int num : numArray){
            if(num % 2 !=0){
                continue;
            }
            System.out.println(num);
        }


    }

}
