import java.util.Scanner;
public class sepdigit
{
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        int H = g.nextInt();
        //int dig;
        // right to left
        /*while(H>0)
        {
            dig =H % 10;
            System.out.println(dig);
            H/=10;
        }*/
        int temp = H;
        int step = 0;
         while(H>0)
         {
            H/=10;
            step++;
         }
         int div =(int) Math.pow(10,step-1);
         while(div>0)
         {
            int dig = (temp/div) % 10;
            System.out.println(dig);
            div/=10;
         }

    }
}