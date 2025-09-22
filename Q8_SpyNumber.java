import java.util.Scanner;

public class Q8_SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0, product = 1, temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");
    }
}