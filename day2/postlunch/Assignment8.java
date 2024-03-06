/**
Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.

HINT : 

maximum difference = higest-lowest

minimum difference = second lowest - lowest
*/

import java.util.Arrays;
import java.util.Scanner;

class Assignment8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];
        int maxDiff = arr[n - 1] - arr[0];
        for (int i = 1; i < n - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
            maxDiff = Math.max(maxDiff, arr[n - 1] - arr[i]);
        }
        System.out.println("The pair with the minimum difference is " + minDiff + ".");
        System.out.println("The pair with the maximum difference is " + maxDiff + ".");
        sc.close();
    }
}