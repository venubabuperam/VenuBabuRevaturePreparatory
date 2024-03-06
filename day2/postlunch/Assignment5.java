/*Write a program to find the sum and product of all elements of an array.*/
import java.util.Scanner;
class Assignment5 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int as=sc.nextInt();
		int arr[]=new int[as];
		for (int i = 0; i < as; i++) {
            		System.out.print("Enter integer number " + (i + 1) + ": ");
            		arr[i] = sc.nextInt();
		}
		int sum=0;
		int product=1;
		for(int i=0;i<as;i++){
			sum+=arr[i];
			product*=arr[i];
		}
		System.out.println("Sum of elements; "+sum);
		System.out.println("product of numbers: "+product);
	}
}
			