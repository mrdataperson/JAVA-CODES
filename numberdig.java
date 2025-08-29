import java.util.Scanner;
public class numberdig
{
    public static void main (String args[])
    {
        Scanner hg = new Scanner(System.in);
        System.out.println("enter the number to find the digit");
        int a = hg.nextInt();

        int count = 0;

        while (a>0)
        {
            a=a/10;
            count++;
        }
    
    System.out.println(count);
    }
}