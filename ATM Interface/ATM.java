import java.util.Scanner;

class BankAccount {
    double balance;

    BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance=balance+amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Enter a valid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance=balance-amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Not enough balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rupees;
        System.out.println("Enter the initial balance: ");
        rupees = input.nextInt();
        BankAccount account = new BankAccount(rupees);

        while (true) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
