/*Write a program to check if a given string is a Palindrome. */
import java.util.Scanner;
public class Assignment4 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
        }
        System.out.println(result);
        if(str.equals(result)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
    
}
