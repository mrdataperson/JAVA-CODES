import java.util.Scanner;
public class maxarr{
    public static void main(String args[])
    {
        Scanner on = new Scanner(System.in);
        int arr[] = new int[3];
        int sum = 0;
        int product = 1;
        for(int i=0;i<arr.length; i++)
            arr[i] = on.nextInt();

        int max = Integer.MIN_VALUE;

        for(int i =0; i<arr.length; i++)
            {
                if(max < arr[i])
                {
                    max = arr[i];
                }
            }

        System.out.println(max);
    }
}