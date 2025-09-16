import java.util.Scanner;
import java.util.Arrays;
public class array{
    public static void main(String args[])
    {   Scanner on = new Scanner(System.in);
        int arr[] = new int[3];
        int sum = 0;
        int product = 1;
        for(int i=0;i<arr.length; i++)
            arr[i] = on.nextInt();


        System.out.println("your array");
        
        
        // FOR EACH LOOP
        for(int a: arr)
            System.out.print(a+" ");
        
        // DIRECT METHOD BY USING THE ARRAY PACKAGE
        
        System.out.println(Arrays.toString(arr));

       //REVERSE STRING

        System.out.println("reverse of string");
        for(int j= arr.length-1;j>=0;j--)
            System.out.println(arr[j]+" ");
        
        // sum of array

        for(int i=0;i<arr.length;i++)
            sum = sum + arr[i];
        System.out.println("sum is " + sum);
        
        // product of array

        for(int i=0;i<arr.length;i++)
            product*= arr[i];
        System.out.println("product is " + product);
    }
}