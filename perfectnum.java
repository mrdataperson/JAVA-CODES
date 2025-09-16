import java.util.Scanner;
public class perfectnum
{   
    static int perfect(int num)
    {   int sum = 0;
        for(int i =1;i<num; i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
        }
        if(sum==num)
        {
            return(0);
        }
        else
            return(1);
    }
    public static void main(String[] args)
    {   Scanner obj = new Scanner(System.in);
        int h = obj.nextInt();
        System.out.println(perfect(h));

    }
}