package JavaChallenges;

public class SumAllOddNumbers
{
    public static void main(String[] args)
    {
        OddNumberSum(20);

    }
    public static void OddNumberSum(int N){
        int i = 1;
        int sum =0;
        while(i<=N){
            //if (i > N) break;
            if(i % 2 != 0){
                 sum+=i;
            }
            i++;
        }
        System.out.println("sum of N odd Numbers is : "+sum); //100

    }

}
