/*Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/
import java.util.Scanner;

class Assignment4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            originalArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }
        System.out.println("Original Array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nReversed Array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}