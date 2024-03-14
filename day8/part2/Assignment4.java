package Day8.part2;
import  java.util.Scanner;
public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int numberOfRows= sc.nextInt();
        for (int i= 0; i<= numberOfRows/2; i++)
        {
            for (int j=0; j<=i; j++)
                System.out.print("*"+ " ");
            System.out.println();
        }
        for (int i=numberOfRows/2 ; i>=0; i--)
        {
            for(int j=0; j <= i-1;j++)
                System.out.print("*"+ " ");
            System.out.println();
        }
    }
}
