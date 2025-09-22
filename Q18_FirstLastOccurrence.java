import java.util.Scanner;

public class Q18_FirstLastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char digit = sc.next().charAt(0);

        int first = number.indexOf(digit) + 1;
        int last = number.lastIndexOf(digit) + 1;

        if (first == 0)
            System.out.println("Digit not found");
        else
            System.out.println("First=" + first + ", Last=" + last);
    }
}