import java.util.Scanner;

public class Q1_PrintDigitsRightToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number > 0) {
            int digit = number % 10;
            System.out.print(digit + " ");
            number = number / 10;
        }
    }
}