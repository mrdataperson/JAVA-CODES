public class neon
{
    public static void main(String args[])
    {
        int sum = 0;
        int n = 9;
        int sq = n*n;
        while(sq>0)
        {
            int dig = sq%10;
            sum+=dig;
            sq/=10;
        }
        if(sum==n)
        {
            System.out.println("it is neon number");
        }
        else
        {
            System.out.println("not neon number");
        }
    }
}