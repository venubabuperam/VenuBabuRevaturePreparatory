/*Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo methid of String) */
import java.util.Scanner;
import java.util.Arrays;
public class Assignment6 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String []arr=new String[10];
        System.out.print("Enter Freinds name: ");
        for(int i=0;i<10;i++){
            arr[i]=sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Friend names in alaphabetical order");
        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
        
        
    }
    
    
}
