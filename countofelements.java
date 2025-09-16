import java.util.Scanner;
public class countofelements
{
    public static void main (String[] args)
    {
        int[] arr = new int[5];
        int i = 0;
        int count = 0;
        Scanner nw = new Scanner(System.in);
        System.out.println("enter number to pass number");
        int num = nw.nextInt();
        System.out.println(" enter the marks");
        for(i = 0; i<arr.length;i++)
        {
            arr[i] = nw.nextInt();

        }
        for(i = 0; i<arr.length;i++)
        {
            if(num <= arr[i])
            {
                count ++;
            }

        }
        System.out.println("pass number" + count);
    }
}