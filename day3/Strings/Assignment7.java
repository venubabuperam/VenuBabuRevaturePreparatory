/*Write a program to replace a given substring in a sentence with another string. For example, in the sentence, ” A batman with bat” if we replace ”bat” with ”snow”, the new sentence should be printed as ”A snowman with snow”. */

    import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring to replace: ");
        String oldSub= scanner.next();
        System.out.print("Enter the replacement string: ");
        String newSub = scanner.next();
        String newStr = str.replace(oldSub, newSub);
        System.out.println("Updated sentence: " + newStr);
    }
}
    

