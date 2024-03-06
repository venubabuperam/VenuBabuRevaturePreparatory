/*Find largest and smallest elements of an array.*/
import java.util.Scanner;
 class Assignment7{
    public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int as=sc.nextInt();
		int array[]=new int[as];
		for (int i = 0; i < as; i++) {
            		System.out.print("Enter integer number " + (i + 1) + ": ");
            		array[i] = sc.nextInt();
		}
       		int largest = array[0];
        	int smallest = array[0];
        	for (int i = 1; i < array.length; i++) {
            		if (array[i] > largest) {
                	largest = array[i];
            	} else if (array[i] < smallest) {
                	smallest = array[i];
            	}
        	}
        	System.out.println("Largest element: " + largest);
        	System.out.println("Smallest element: " + smallest);
    	}
}