/* Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers*/

import java.util.Scanner;
class Assignment7 {
	public static void main(String[] args) {
        	Scanner scanner = new Scanner(System.in);
        	System.out.print("Enter the first number: ");
        	int num1 = scanner.nextInt();
        	System.out.print("Enter the second number: ");
        	int num2 = scanner.nextInt();
		while(num2 !=0){
			int temp=num2;
			num2=num1%num2;
			num1=temp;
		}
        	System.out.println("GCD of two numbers: "  + num1);
        	scanner.close();
    	}
}