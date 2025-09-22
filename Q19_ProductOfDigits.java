import java.util.Scanner;

public class Q19_ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int product = 1;
        int temp = number;
        if (temp == 0) product = 0;

        while (temp > 0) {
            int digit = temp % 10;
            product *= digit;
            temp /= 10;
        }
        System.out.println(product);
    }
}