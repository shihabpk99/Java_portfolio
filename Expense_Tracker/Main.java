package Expense_Tracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("==== Expense Tracker ====");
            System.out.println("1. Add Transaction");
            System.out.println("2. View All Transactions");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Type (Income/Expense): ");
                String type = scanner.nextLine();

                System.out.print("Enter Category: ");
                String category = scanner.nextLine();

                System.out.print("Enter Amount: ");
                double amount = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter Date (YYYY-MM-DD): ");
                String date = scanner.nextLine();

                Transaction t = new Transaction(id, type, category, amount, date);
                manager.addTransaction(t);

            } else if (choice == 2) {
                manager.viewAllTransactions();

            } else if (choice == 3) {
                System.out.println("Exiting... Goodbye!");

            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
