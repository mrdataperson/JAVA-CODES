import java.util.Scanner;
public class Age
{
    public static void main(String args[])
    {
        Scanner K = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = K.nextInt();
        if (a>=18)
        System.out.println("yor are eligible to vote"); 
        else
        System.out.println("yor are not eligible to vote");
    }
}