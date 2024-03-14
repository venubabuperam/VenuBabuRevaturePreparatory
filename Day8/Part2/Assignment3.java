package Day8.part2;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) {
        for (int j = rows; j > i; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
        for (int i = 2; i <= rows; i++) {
        for (int j = rows; j > i; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j <= 2 * i - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

        sc.close();
    }

}
