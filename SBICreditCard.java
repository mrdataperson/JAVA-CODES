import java.util.Scanner;

public class SBICreditCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int primaryAge = sc.nextInt();
        int addonAge = sc.nextInt();
        int employment = sc.nextInt();
        int income = sc.nextInt();

        if(primaryAge >= 21 && primaryAge <= 60 &&
           addonAge >= 18 &&
           (employment >= 1 && employment <= 4) &&
           income <= 300000) {
            System.out.println("Yes. You are eligible for SBI credit cards");
        } else {
            System.out.println("No. You are not eligible for SBI credit cards");
        }
    }
}
