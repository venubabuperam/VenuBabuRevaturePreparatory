package Day8.part1;
import java.util.Scanner;

import java.util.Scanner;

public class Assignment1 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == 1 || i == n || j==1 || j==n )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }

}
