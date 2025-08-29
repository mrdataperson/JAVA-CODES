import java.util.Scanner;
public class sumdigit
{
    public static void main(String args[])
    {
        Scanner g = new Scanner(System.in);
        int H = g.nextInt();
        int temp = H;
        int step = 0;
        int mul = 1;
        int add = 0;
        int sub = 0;
        int divi = 1;
         while(H>0)
         {
            H/=10;
            step++;
         }
         int div =(int) Math.pow(10,step-1);
         while(div>0)
         {
            int dig = (temp/div) % 10;
            //System.out.println(dig);
            mul*=dig;
            add+=dig;
            sub-=dig;
            divi/=dig;

            div/=10;
         }
        System.out.println(mul);
        System.out.println(divi);
        System.out.println(add);
        System.out.println(sub);

    }
}