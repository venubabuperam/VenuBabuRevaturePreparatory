/*Take 10 integer inputs from user and store them in an array and print them on screen.*/
import java.util.Scanner;
class Assignment1{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int []numbers=new int[10];
		for(int i=0;i<10;i++){
			System.out.println("Enter "+(i+1)+" number:");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Array Values Are: ");
		for(int i=0;i<10;i++)
			System.out.print(numbers[i]+",");
	}
}
		