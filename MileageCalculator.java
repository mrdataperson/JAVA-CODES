import java.util.Scanner;

public class MileageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double start = sc.nextDouble();
        double end = sc.nextDouble();
        double miles = end - start;
        double remuneration = miles * 25;
        System.out.printf("%.2f %.2f", miles, remuneration);
    }
}
