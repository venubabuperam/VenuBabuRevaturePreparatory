/*Take 10 integers from keyboard using loop and print their average value on the screen.*/
import java.util.Scanner;
class Assignment4{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int avg=0;
		for(int i=0;i<10;i++){
			System.out.print("Enter Value :");
			int n=sc.nextInt();
			sum+=n;
		}
		avg=sum/10;
		System.out.println("Average :"+avg);
	}
}