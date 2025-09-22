import java.util.Scanner;

public class Q6_CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while (number != 1) {
            System.out.print(number + ", ");
            if (number % 2 == 0)
                number = number / 2;
            else
                number = 3 * number + 1;
        }
        System.out.println(1);
    }
}