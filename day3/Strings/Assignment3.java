/*Write a program to find the number of vowels, consonents, digits and white space characters in a string. */
import java.util.Scanner;
public class Assignment3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str=sc.nextLine();
        int vowels=0,consonents=0,digits=0,whiteSpace=0;
        for(int i =0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == ' '){
                whiteSpace+=1;
                continue;
            }
            else if((ch>= 'a' && ch <= 'z') ||(ch >= 'A' && ch <= 'Z')){
                ch = Character.toLowerCase(ch); 
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                    vowels+=1; 
                else
                    consonents+=1; 
            }
            else{
                digits+=1;
            } 

        }
        System.out.println("Vowels: "+vowels);
        System.out.println("consonents: "+consonents);
        System.out.println("digits: "+digits);
        System.out.println("Whitespaces: "+whiteSpace);
    }
}

