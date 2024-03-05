/*Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments.*/
class Assignment2 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Error");
            return;
        }
        
        double side1 = Double.parseDouble(args[0]);
        double side2 = Double.parseDouble(args[1]);
	double side3 = Double.parseDouble(args[2]);
        
        double perimeter = side1+side2+side3;
        
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}