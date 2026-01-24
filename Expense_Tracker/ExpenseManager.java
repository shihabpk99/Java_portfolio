package Expense_Tracker;

import java.util.ArrayList;

public class ExpenseManager {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t) {
        transactions.add(t);
        System.out.println("Transaction added.");
    }

    public void viewAllTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction t : transactions) {
            t.display();
        }
    }
}
