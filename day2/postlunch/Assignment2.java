/*Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/
import java.util.Scanner;
class Assignment2{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		int []numbers=new int[10];
		for(int i=0;i<10;i++){
			System.out.println("Enter "+(i+1)+" number:");
			numbers[i]=sc.nextInt();
		}
		System.out.println("Enter give a number: ");
		int ask=sc.nextInt();
		for(int i=0;i<10;i++){
			if(ask==numbers[i]){
				count=1;
				break;
			}
		}
		if(count==1){
			System.out.println("Number presnt");
		
		}else{
			System.out.println("Number not present");
		}
	}
}