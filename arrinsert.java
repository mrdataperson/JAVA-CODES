import java.util.*;
public class arrinsert
{
    public static void main(String[] args)
    {   Scanner on = new Scanner(System.in);
        int size = on.nextInt();
        int arr[] = new int[size+1]; // +1 is for shifting the new value space
        for(int i = 0;i<size;i++)
        {
            arr[i]=on.nextInt();
        }
        int pos = on.nextInt();
        int ele = on.nextInt();
        
        for(int i= size;i>=pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1] = ele;

        System.out.println(Arrays.toString(arr));

    }
}