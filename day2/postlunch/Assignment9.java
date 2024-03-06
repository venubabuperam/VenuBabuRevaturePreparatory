/**
Sorting refers to arranging data in a particular format. Sort an array of integers in ascending order. One of the algorithm is selection sort. Use below explanation of selection sort to do this.

INITIAL ARRAY :

2	3	1	45	15

First iteration : Compare every element after first element with first element and if it is larger then swap. In first iteration, 2 is larger than 1. So, swap it.

1	3	2	45	15

Second iteration : Compare every element after second element with second element and if it is larger then swap. In second iteration, 3 is larger than 2. So, swap it.

1	2	3	45	15

Third iteration : Nothing will swap as 3 is smaller than every element after it.

1	2	3	45	15

Fourth iteration : Compare every element after fourth element with fourth element and if it is larger then swap. In fourth iteration, 45 is larger than 15. So, swap it.

1	2	3	15	45
*/
import java.util.Scanner;
class Assignment9{
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array size: ");
	int as=sc.nextInt();
	int arr[]=new int[as];
	for (int i = 0; i < as; i++) {
            	System.out.print("Enter integer number " + (i + 1) + ": ");
            	arr[i] = sc.nextInt();
	}
	System.out.println("Initial Array:");
        printArray(arr);

	int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        printArray(arr);
    }
}