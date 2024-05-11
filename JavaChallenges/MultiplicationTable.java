package JavaChallenges;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
         multiplicationTable(5);
    }
    public static void multiplicationTable(int num)
    {
        int res =0;
        int i=1;
        while( i > 0 && i <=10)
        {
             res= num*i;
            System.out.println(num + " * " + i + " = " + res);
            i++;
        }
        return ;
    }
}
