/* Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments.*/
class Assignment1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error");
            return;
        }
        
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);
        
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}