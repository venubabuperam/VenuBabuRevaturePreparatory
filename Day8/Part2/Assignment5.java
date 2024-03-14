package Day8.part2;
import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args)
    {
        System.out.println("Enter the size of Pascal triangle : ");
        Scanner sc = new Scanner(System.in);
        int numberOfRows= sc.nextInt();
        for (int i= 1; i<=numberOfRows ; i++)
        {
            for (int j=i; j<numberOfRows; j++)
                System.out.print(" ");
            for (int k=1; k<=i;k++)
                System.out.print("*");

            System.out.println();
        }
        for (int i=numberOfRows; i>=1; i--)
        {
            for(int j=i; j <=numberOfRows;j++)
                System.out.print(" ");
            for(int k=1; k<i ;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
