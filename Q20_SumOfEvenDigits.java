import java.util.Scanner;

public class Q20_SumOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 == 0) sum += digit;
            temp /= 10;
        }
        System.out.println(sum);
    }
}