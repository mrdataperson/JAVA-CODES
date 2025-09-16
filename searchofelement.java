import java.util.Scanner;
public class searchofelement
{
    public static void main (String[] args)
    {
        int[] arr = new int[5];
        int i = 0;
        boolean result = false;
        Scanner nw = new Scanner(System.in);
        System.out.println("enter number to search");
        int num = nw.nextInt();;
        for(i = 0; i<arr.length;i++)
        {
            arr[i] = nw.nextInt();

        }
        for(i = 0; i<arr.length;i++)
        {
            if(num == arr[i])
            {
                result = true;
                break;
            }

        }
        if (result == true)
        {
            System.out.println("in position  " + i);
        }
        else
            System.out.println("-1");
    }
}