import java.util.Scanner;
public class amstrong
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number to check amstrong");
        int ch = ob.nextInt();
        
        while (ch > 0) {
            int digit = ch % 10; // Get the last digit
            sum += digit * digit * digit; // Cube the digit and add to sum
            ch /= 10; // Remove the last digit
        }
        System.out.println("The sum of the cubes of the digits is: " + sum);

        if(ch==sum)
        {
            System.out.println("it is amstrong number");
        }
        else
        {
            System.out.println("not amstrong number");
        }
    }
}