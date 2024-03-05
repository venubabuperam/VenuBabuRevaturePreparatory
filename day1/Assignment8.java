/* Write a program to calculate the sum of the first and the second last digit of a 5 digit.*/
import java.util.Scanner;

class Assignment8{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number 5 digit number: ");
		int number1 = scanner.nextInt();
		int firstDigit=number1/10000;
		int secondLastNumber=(number1/10)%10;
		System.out.println("Sum of the first and second last digit of a 5 digit number: "+(firstDigit+secondLastNumber));
 		scanner.close();
	}
}
		
		
		
		