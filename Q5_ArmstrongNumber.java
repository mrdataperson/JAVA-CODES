import java.util.Scanner;

public class Q5_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int length = String.valueOf(number).length();
        int sum = 0, temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }

        if (sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}