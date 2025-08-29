import java.util.Scanner;
class posneg
{
    public static void main(String args[])
    {
        Scanner K = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = K.nextInt();
        System.out.println("enter the second number");
        int b = K.nextInt();

        if (a==b)
        System.out.println("the values you have entered" + a + " & " + b + "are equal");
        else if(a>b)
        System.out.println("the values you have entered" + a + " & " + b + "a is greater");
        else
        System.out.println("the values you have entered" + a + " & " + b + "b is greater");
    }
}