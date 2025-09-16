public class news
{
    public static void main (String[] args)
    {   int n= 1;
        for(int j = 0;j<=5;j++)  
        {
        if(n%2==0)
        {   if(n==2)
             {
                System.out.print(" * * *");
                ++n ;
             }
            else
{            for(int i=0; i<=n;i++){
            System.out.print(" *");
            }
            ++n;}
        }
        else{
            if(n==1)
            {
                System.out.print(" *");
                ++n;
            }
            else  
            { 
            for(int i=0;i<n-1;i++)
            {
            System.out.print(" *");
            }
            ++n;
            }
        }
        System.out.println(" ");
        }
    }
}