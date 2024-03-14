package Day8.part1;
import  java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n*3);j++){
                if(i == 1 || i == n || j==1 || j==n || j%n==0 || j%n==1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
