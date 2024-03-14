package Day8.part2;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // Number of n for the upper half of the diamond

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // Printing spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
