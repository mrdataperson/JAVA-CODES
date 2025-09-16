import java.util.Scanner;
public class evendig
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int g = obj.nextInt();
        
        while(g>0)
        {
            int dig = g%10;
            if(dig%2==0) 
            {
                System.out.println(dig);      }
            g/=10;
        }

    }
}