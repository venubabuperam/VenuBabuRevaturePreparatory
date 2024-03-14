//3.Left Down Triangle
package day7;
import java.util.Scanner;
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = n-i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
