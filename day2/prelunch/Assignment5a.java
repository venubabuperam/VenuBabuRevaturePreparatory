/*Print the following patterns using loop*/
//a.

//*

//**

//***

//****
class Assignment5a {
    public static void main(String[] args) {
        int rows = 4; // Change this value to adjust the number of rows
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}