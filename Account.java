import java.util.Scanner;

public class Account {
    private double balance;

    // Method to start an account
    public void startAccount(double initialBalance) {
        balance = initialBalance;
        System.out.println("Account started with initial balance: $" + initialBalance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            displayBalance();
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        // Start account with initial balance
        System.out.print("Enter initial balance: $");
        double initialBalance = scanner.nextDouble();
        account.startAccount(initialBalance);

        // Deposit money
        System.out.print("Enter deposit amount: $");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw money
        System.out.print("Enter withdrawal amount: $");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        scanner.close();
    }
}
