import java.util.Scanner;

public class Main {
    static class BankAccount {
        String accountNumber;
        String ownerName;
        double balance;


        BankAccount(String accountNumber, String ownerName, double balance) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
            this.balance = balance;
        }


        void displayInfo() {
            System.out.println("\n=== Account Info ===");
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Balance: $" + balance);
            System.out.println();
        }


        void depositMoney(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("✅ Successfully deposited $" + amount);
            } else {
                System.out.println("❌ Invalid deposit amount.");
            }
        }


        void withdrawMoney(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("✅ Successfully withdrawn $" + amount);
            } else {
                System.out.println("❌ Insufficient balance or invalid amount.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine();

        System.out.print("Enter owner name: ");
        String ownerName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();


        BankAccount userAccount = new BankAccount(accNumber, ownerName, balance);
        userAccount.displayInfo();

        
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                userAccount.depositMoney(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                userAccount.withdrawMoney(amount);
            } else if (choice == 3) {
                userAccount.displayInfo();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("❌ Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
