import java.util.Scanner;

public class Q4_SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}