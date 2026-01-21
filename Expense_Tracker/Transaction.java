package Expense_Tracker;

public class Transaction {
    private int id;
    private String type;
    private String category;
    private double amount;
    private String date;

    public Transaction(int id, String type, String category, double amount, String date) {
        this.id = id;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
    }
}

