import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;
        System.out.println("Max=" + max + " Min=" + min);
    }
}
