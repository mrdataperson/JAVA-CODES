import java.util.Scanner;
public class bankacc
{
    public static void main(String[] args)
    {
        int balance = 100000;
        int withdraw = 0;
        int deposit = 0;
        int work = 0;
        Scanner ok = new Scanner(System.in);
        while(work==0)
        {
            System.out.println("WECOME TO THE BACK");
            System.out.println("choose the transaction 1.withdraw 2.deposit 3.balance");
            int resp = ok.nextInt();
            switch(resp)
            {
                case (1) : {
                    System.out.println(" enter the amount to withdraw");
                    withdraw = ok.nextInt();
                    if(int h = balance - withdraw>=1000)
                    {balance = balance - withdraw;}
                    else
                    {
                        System.out.println("you don't have the minimum balance to withdraw");
                    }
                    break;
                }
                case (2) : {
                    System.out.println(" enter the amount to deposit");
                    deposit = ok.nextInt();
                    balance = balance + deposit;
                    break;
                }
                case (3) : {
                    System.out.println(" the balance in your account is " + balance);
                    break;
                }
            }
        }

    }
}