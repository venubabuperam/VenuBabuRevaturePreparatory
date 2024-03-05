 /*Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks*/
import java.util.Scanner;

 class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the marks of Robert in three subjects (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        
        scanner.close();
        
        int totalMarks = subject1 + subject2 + subject3;
        double percentage = (totalMarks / 300.0) * 100;
        
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage marks: " + percentage + "%");
    }
}		