/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/
import java.util.Scanner;
class Assignment1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length:");
		int length = sc.nextInt();
		System.out.print("Enter the breadth: ");
		int breadth = sc.nextInt();
		if(length == breadth){
			System.out.println("It's a square");
		
		}
		else{
			System.out.println("It's not a square");
		}
	}
}
		