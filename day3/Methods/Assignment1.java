import java.util.Scanner;

public class Assignment1 {
    static void Maximum(int a, int b, int c) {
            int max = Math.max(Math.max(c,a), b);
            System.out.println("Maximum number: " + max);
        }
    static void Minimum(int a, int b, int c) {
            int min = Math.min(Math.min(c,a), b);
            System.out.println("Minimum number: " + min);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number: ");
        int num3 = sc.nextInt();
     Maximum(num1, num2, num3);
     Minimum(num1, num2, num3);
    }
    
}