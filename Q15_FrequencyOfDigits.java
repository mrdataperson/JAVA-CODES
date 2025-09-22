import java.util.Scanner;

public class Q15_FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        int[] freq = new int[10];

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            freq[ch - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + "→" + freq[i]);
            }
        }
    }
}