package codeSoft3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMMachine {
    private Map<String, Account> accounts = new HashMap<>();

    public ATMMachine() {
        accounts.put("1234", new Account(1000.00));
        accounts.put("5678", new Account(2000.00));
        accounts.put("9012", new Account(3000.00));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        Account account = accounts.get(pin);
        if (account == null) {
            System.out.println("Invalid PIN.");
            return;
        }

        while (true) {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    account.withdraw(amount);
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static class Account {
        private double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void checkBalance() {
            System.out.println("Your balance is: $" + balance);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful.");
            }
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful.");
        }
    }

    
}


    

