package Expense_Tracker;

public class Main {
    public static void main(String[] args) {
       
        ExpenseManager manager = new ExpenseManager();

Transaction t1 = new Transaction(1, "Expense", "Food", 250.0, "2026-01-25");
manager.addTransaction(t1);

manager.viewAllTransactions();


    }
}
