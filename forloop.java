public class forloop
{
    public static void main(String[] args)
    {   int k = 0;
        for(int j=1; j<=4; j++){
        for(int i=1; i<=j ;i++ )
        {   ++k;
            if (k==10)
            System.out.print(" 0");
            else
            System.out.print(" "+k);
        }System.out.println(" ");
        }
    }
}
