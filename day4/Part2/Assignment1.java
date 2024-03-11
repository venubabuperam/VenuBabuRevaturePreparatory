/*Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects. */
import java.util.Scanner;
class Employees {
    String name;
    double salary;
    String dateOfJoining;

    public Employees(String n, double s, String doj) {
        name = n;
        salary = s;
        dateOfJoining = doj;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + "\tSalary: " + salary + "\tDate of Joining: " + dateOfJoining);
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employees[] employees = new Employees[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name for employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // consume the newline character
            System.out.print("Enter date of joining for employee " + (i + 1) + ": ");
            String doj = scanner.nextLine();

            employees[i] = new Employees(name, salary, doj);
        }

        System.out.println("\nEmployee Information:");
        for (Employees employee : employees) {
            employee.displayInfo();
        }
    }
}