package Expense_Tracker;

public class Transaction {
    private int id;
    private String type;      // income or expense
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

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }

    public void display() {
    System.out.println("ID: " + id);
    System.out.println("Type: " + type);
    System.out.println("Category: " + category);
    System.out.println("Amount: " + amount);
    System.out.println("Date: " + date);
    System.out.println("------");
}

@Override
public String toString() {
    return "ID: " + id +
           ", Type: " + type +
           ", Category: " + category +
           ", Amount: " + amount +
           ", Date: " + date;
}

}
