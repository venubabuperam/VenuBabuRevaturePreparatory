/*
Print the following patterns using loop :*/
//1010101

//10101 

  //101  

   //1   
class Assignment5b {
    public static void main(String[] args) {
        int rows = 4; 
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i + 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}