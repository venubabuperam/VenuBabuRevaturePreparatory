import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();
        emp.add(new Employee(10,"ram",250000));
        emp.add(new Employee(13,"raja",5000000));
        emp.add(new Employee(14,"nikhil",100000));
        emp.add(new Employee(12,"babu",600000));
        System.out.println("Employees with salary > 400000:");
        emp.stream().filter(e -> e.getSalary() > 400000).forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));
        emp.forEach(e -> e.setSalary(e.getSalary() * 1.25));

        // Display updated salaries
        System.out.println("\nEmployee details after 25% salary increase:");
        emp.forEach(e -> System.out.println("ID: " + e.getId() + ", Name: " + e.getName() + ", Salary: " + e.getSalary()));

        List<String> empNames = emp.stream().map(Employee::getName).map(String::toUpperCase).toList();

        // Display employee names in uppercase
        System.out.println("\nEmployee names in uppercase:");
        empNames.forEach(System.out::println);

    }
}
