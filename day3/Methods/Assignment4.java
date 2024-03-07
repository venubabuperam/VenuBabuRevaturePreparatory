import java.util.Scanner;

/**
 * Using recursion, define a method to know nth term of a Fibonacci series.

Nth term of Fibonacci series is

F(n) = F(n-1)+(n-2)

F(0) = 0

F(1) = 1

F(2) = F(1)+(0) = 1+0 = 1

F(3) = F(2)+(1) = 1+1 = 2

F(4) = F(3)+(2) = 2+1 = 3
 */
public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term of Fibonacci series : ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println("The " + n + "th term of Fibonacci series is: " + result);
    }
    public static int fib(int n) {
            if (n <= 1) {
                return n;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }
}
