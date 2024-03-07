/*Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”. */
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (isPalindrome(word)) {
                for (int i = 0; i < word.length(); i++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}