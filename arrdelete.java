import java.util.*;
public class arrdelete
{
    public static void main(String[] args)
    {   Scanner on = new Scanner(System.in);
        int size = on.nextInt();
        int arr[] = new int[size+1]; // +1 is for shifting the new value space
        for(int i = 0;i<size;i++)
        {
            arr[i]=on.nextInt();
        }
        System.out.println(" enter your choice 1. by pos 2. by value");
        int val = on.nextInt();
        switch(val)
        {case 1:{
            System.out.println("enter the pos to delete");
            int pos = on.nextInt();
            for(int i=pos-1;i<size;i++)
            {
                arr[i]=arr[i+1];
            }
                break;
            }
        case 2:{
            System.out.println("enter the val to delete");
            int vale = on.nextInt();
            for(int i=0;i<size;i++)
            {
                if(arr[i]==vale)
                {
                    for(int j=i;j<size;j++)
                    {
                        arr[j]=arr[j+1];
                    }
                }
                
            }
                break;
            }
            }
        for(int i = 0; i<size;i++)
        System.out.print(" "+ arr[i]);


    }
}