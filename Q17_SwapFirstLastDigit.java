import java.util.Scanner;

public class Q17_SwapFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if (number.length() == 1) {
            System.out.println(number);
            return;
        }

        char first = number.charAt(0);
        char last = number.charAt(number.length() - 1);

        String result = last + number.substring(1, number.length() - 1) + first;
        System.out.println(result);
    }
}