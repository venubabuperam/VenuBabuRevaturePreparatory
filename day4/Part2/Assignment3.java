/*3. Lets create a bank account. Create a class named 'BankAccount' with the following data members
1 - Name of depositor
2 - Address of depositor
3 - Type of account
4 - Balance in account
5 - Number of transactions
Class 'BankAccount' has a method for each of the following 1 - Generate a unique account number for each depositor
For first depositor, account number will be BA1000, for second depositor it will be BA1001 and so on
2 - Display information and balance of depositor
3 - Deposit more amount in balance of any depositor
4 - Withdraw some amount from balance deposited
5 - Change address of depositor
After creating the class, do the following operations
1 - Enter the information (name, address, type of account, balance) of the depositors. Number of depositors are to be entered by user.
2 - Print the information of any depositor.
3 - Add some amount to the account of any depositor and then display final informaion of that depositor
4 - Remove some amount from the account of any depositor and then display final informaion of that depositor
5 - Change the address of any depositor and then display the final information of that depositor
6 - Randomly repeat these processes for some other bank accounts and after that print the total number of transactions
----------- */
import java.util.Scanner;

class BankAccount {
    private static int accountNumberCounter = 1000;

    private String name;
    private String address;
    private String accountType;
    private double balance;
    private int numberOfTransactions;
    public BankAccount(String name, String address, String accountType, double balance) {
        this.name = name;
        this.address = address;
        this.accountType = accountType;
        this.balance = balance;
        this.numberOfTransactions = 0;
        this.accountNumberCounter++;
    }

    public void displayInfo() {
        System.out.println("\nDepositor Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: BA" + accountNumberCounter);
        System.out.println("Balance: $" + balance);
    }
    public void deposit(double amount) {
        balance += amount;
        numberOfTransactions++;
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numberOfTransactions++;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    public void changeAddress(String newAddress) {
        address = newAddress;
        numberOfTransactions++;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }
}

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of depositors: ");
        int numberOfDepositors = scanner.nextInt();
        scanner.nextLine(); 
        BankAccount[] accounts = new BankAccount[numberOfDepositors];      
        for (int i = 0; i < numberOfDepositors; i++) {
            System.out.println("\nEnter information for Depositor " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Address: ");
            String address = scanner.nextLine();
            System.out.print("Account Type: ");
            String accountType = scanner.nextLine();
            System.out.print("Initial Balance: $");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            accounts[i] = new BankAccount(name, address, accountType, initialBalance);
        }
        for (int i = 0; i < numberOfDepositors; i++) {
            accounts[i].displayInfo();
            System.out.print("\nEnter the amount to deposit for Depositor " + (i + 1) + ": $");
            double depositAmount = scanner.nextDouble();
            accounts[i].deposit(depositAmount);
            accounts[i].displayInfo();
            System.out.print("\nEnter the amount to withdraw for Depositor " + (i + 1) + ": $");
            double withdrawAmount = scanner.nextDouble();
            accounts[i].withdraw(withdrawAmount);
            accounts[i].displayInfo();
            scanner.nextLine(); 
            System.out.print("\nEnter the new address for Depositor " + (i + 1) + ": ");
            String newAddress = scanner.nextLine();
            accounts[i].changeAddress(newAddress);
            accounts[i].displayInfo();
        }
        int totalTransactions = 0;
        for (int i = 0; i < numberOfDepositors; i++) {
            totalTransactions += accounts[i].getNumberOfTransactions();
        }
        System.out.println("\nTotal Number of Transactions: " + totalTransactions);
        scanner.close();
    }
}