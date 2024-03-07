/*
 * Write a program that takes as input your gross salary and your total saving and uses another function named taxCalculator() to calculate your tax. The taxCalculator() function takes as parameters the gross salary as well as the total savings amount. The tax is calculated as follows:

(a) The savings is deducted from the gross income to calculate the taxable income. Maximum deduction of savings can be Rs. 100,000, even though the amount can be more than this.
(b)  For up to 100,000 as taxable income the tax is 0 (Slab 0); beyond 100,000 to 200,000 tax is 10% of the difference above 100,000 (Slab 1); beyond 200,000 up to 500,000 the net tax is the tax calculated from Slab 0 and Slab 1 and then 20% of the taxable income exceeding 200,000 (Slab 2); if its more than 500,000, then the tax is tax from Slab 0, Slab 1, Slab 2 and 30% of the amount exceeding 500,000.
 */

import java.util.Scanner;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gross salary: ");
        double grossSalary = sc.nextDouble();
        System.out.print("Enter total savings: ");
        double totalSavings = sc.nextDouble();
        double tax = taxCalculator(grossSalary, totalSavings);
        System.out.println("tax amount is: " + tax);
    }
    public static double  taxCalculator(double grossSalary, double taxableIncome) {
        if (taxableIncome <= 100000) 
            return 0;
        else if (taxableIncome <= 200000) 
            return 0.1 * (taxableIncome - 100000);
        else if (taxableIncome <= 500000) 
            return (0.1 * 100000) + 0.2 * (taxableIncome - 200000);
        else 
            return (0.1 * 100000) + (0.2 * 300000) + 0.3 * (taxableIncome - 500000);
        
    }
    
}
