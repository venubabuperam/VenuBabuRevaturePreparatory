/**
create a class employee having id,name and salary.

create constructors,getter ,setters.

In the name class create an array List containing 4 diff employee obj, using Stream API display the details of employee having salary > 400000 ,

Update the emp salary by 25% and display the same,

Convert the names of emp to uppercase and store it in another list named as empNames and display it.
*/
public class Employee {
    private  int id;
    private  String name;
    private  double salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
