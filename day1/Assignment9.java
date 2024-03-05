/* Write a program to calculate the sum of the digits of a 3-digit number.*/
import java.util.Scanner;
class Assignment9{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 3 digit number: ");
		int number=scanner.nextInt();
		int rem=0;
		int sum=0;
		while(number!=0){
			rem=number%10;
			sum+=rem;
			number=number/10;
		}
		System.out.println("sum of the digits of a 3 digit number: "+sum);
	}
}

		