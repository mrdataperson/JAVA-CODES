import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        boolean prime = true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Prime" : "Not Prime");
    }
}
