import java.util.Scanner;

public class Q2_PrintDigitsLeftToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        for (int i = 0; i < number.length(); i++) {
            System.out.print(number.charAt(i) + " ");
        }
    }
}