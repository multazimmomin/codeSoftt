package codeSoft3;

import java.util.Scanner;

public class connect {



    private static final String[] PINS = {"1234", "5678", "9012"};
    private static final BankAccount[] ACCOUNTS = {
        new BankAccount(1000.00),
        new BankAccount(2000.00),
        new BankAccount(3000.00)
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();

        int accountIndex = -1;
        for (int i = 0; i < PINS.length; i++) {
            if (PINS[i].equals(pin)) {
                accountIndex = i;
                break;
            }
        }

        if (accountIndex == -1) {
            System.out.println("Invalid PIN.");
            return;
        }

        ATM atm = new ATM(ACCOUNTS[accountIndex]);
        atm.start();
    }

    public static class ATM {
        private BankAccount account;

        public ATM(BankAccount account) {
            this.account = account;
        }

        public void start() {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Check balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        withdraw();
                        break;
                    case 3:
                        deposit();
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        public void checkBalance() {
            System.out.println("Your balance is: $" + account.getBalance());
        }

        public void withdraw() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (!account.withdraw(amount)) {
                System.out.println("Insufficient funds.");
            } else {
                System.out.println("Withdrawal successful.");
            }
        }

        public void deposit() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();

            account.deposit(amount);
            System.out.println("Deposit successful.");
        }
    }
}
    

