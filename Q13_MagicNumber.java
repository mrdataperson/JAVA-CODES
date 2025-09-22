import java.util.Scanner;

public class Q13_MagicNumber {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = number;
        while (sum > 9) {
            sum = digitSum(sum);
        }

        if (sum == 1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
    }
}