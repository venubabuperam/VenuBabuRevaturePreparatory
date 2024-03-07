import java.util.Scanner;

/**
 *  Define a method named 'perfect' that determines if parameter number is a perfect number. Use this function in a program that determines and prints all the perfect numbers between 1 and 1000.

[An integer number is said to be "perfect number" if its factors, including 1(but not the number itself), sum to the number. E.g., 6 is a perfect number because 6=1+2+3].
 */
public class Assignmrnt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perfect numbers between 1 and 1000:");
        for (int i = 2; i <= 1000; i++) {
            int result= perfect(i);
            if (result == i) {
                System.out.print(i + " ");
            }
        }
    }
     public static int perfect(int num) {
            int sum = 0;  
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }     
            return sum;
        }
}
