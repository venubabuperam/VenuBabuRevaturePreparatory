/* Print the multiplication table of 15 using recursion. */
public class Assignment3 {
    public static void main(String[] args) {
        int mul= 15;
        System.out.println("Multiplication table of " + mul + ":");
        printTable(mul, 1);
    }
    static void printTable(int m, int n) {
        if (n <= 10) {
            int result = m * n;
            System.out.println(n+ " * " + m + " = " + result);
            printTable(m, n + 1);
        }
    }
}
