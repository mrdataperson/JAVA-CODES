import java.util.Scanner;

public class Q14_CenterDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        if (number.length() % 2 == 0)
            System.out.println(-1);
        else
            System.out.println(number.charAt(number.length() / 2));
    }
}