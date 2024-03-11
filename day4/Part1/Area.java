/* Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
import java.util.Scanner;

class AreaRect {
    private double length;
    private double breadth;
    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }
    public double getArea() {
        return length * breadth;
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaRect rectangle = new AreaRect();
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = scanner.nextDouble();
        rectangle.setDim(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}