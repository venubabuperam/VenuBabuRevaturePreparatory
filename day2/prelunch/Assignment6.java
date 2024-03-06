/*Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.*/
import java.util.Scanner;
class Assignment6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;
        while (true) {
            System.out.print("Enter an integer (press 'q' to quit): ");
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum += number;
            product *= number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        } else {
            System.out.println("No numbers entered.");
        }
        
    }
}
 