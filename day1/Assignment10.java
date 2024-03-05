/*Write a program to reverse a 3-digit number.*/
import java.util.Scanner;
class Assignment10{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3-digit number :");
		int number=scanner.nextInt();
		int rem=0;
		int rev=0;
		while(number != 0){
			rem=number%10;
			rev=(rev*10)+rem;
			number=number/10;
		}
		System.out.println("Reverse of a 3 digit number: "+rev);
	}
}
		