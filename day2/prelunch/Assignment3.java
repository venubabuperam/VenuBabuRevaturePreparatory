/**
*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
*Take following input from user
*Number of classes held
*Number of classes attended.
*And print
*percentage of class attended
*Is student is allowed to sit in exam or not.
*allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
*/
import java.util.Scanner;
class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();
	System.out.println("Number of classes held: "+totalClasses+"\n"+"number of classes attended: "+attendedClasses);
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("Student is allowed to sit in the exam.");
        } else {
            System.out.print("Is there a medical cause? (Y/N): ");
            char medicalCause = scanner.next().charAt(0);
            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("Student is allowed to sit in the exam due to medical cause.");
            } else {
                System.out.println("Student is not allowed to sit in the exam.");
            }
        }
        
        scanner.close();
    }
}