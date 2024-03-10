package codeSoft3;

import java.util.Scanner;

public class AtM {
    private static final double[] BALANCES = {1000.00, 2000.00, 3000.00};
    private static final String[] PINS = {"1234", "5678", "9012"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        while (true) {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: $" + BALANCES[accountIndex]);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    if (amount > BALANCES[accountIndex]) {
                        System.out.println("Insufficient funds.");
                    } else {
                        BALANCES[accountIndex] -= amount;
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    BALANCES[accountIndex] += amount;
                    System.out.println("Deposit successful.");
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


    
    

