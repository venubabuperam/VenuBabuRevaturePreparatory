package day7;
/*The hollow square is the same as the square pattern but stars only at the borders. Which makes it a hollow square

 * * * * *
 *       *
 *       *
 *       *
 * * * * *

 */

import  java.util.Scanner;
public class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print stars only at the borders
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print("  "); // Print spaces for the inner part
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
