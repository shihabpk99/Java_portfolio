package Expense_Tracker;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ExpenseManager {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    private final String FILE_PATH = "data/transactions.txt";


    public void addTransaction(Transaction t) {
    transactions.add(t);
    saveToFile();
    System.out.println("Transaction added.");
}


    public void viewAllTransactions() {
        for (Transaction t : transactions) {
    System.out.println(t);
}

    }

    private void saveToFile() {
    try (FileWriter writer = new FileWriter(FILE_PATH)) {
        for (Transaction t : transactions) {
            writer.write(
                t.getId() + "," +
                t.getType() + "," +
                t.getCategory() + "," +
                t.getAmount() + "," +
                t.getDate() + "\n"
            );
        }
    } catch (IOException e) {
        System.out.println("Error saving transactions.");
    }
}

private void loadFromFile() {
    File file = new File(FILE_PATH);
    if (!file.exists()) return;

    try (Scanner scanner = new Scanner(file)) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");

            int id = Integer.parseInt(data[0]);
            String type = data[1];
            String category = data[2];
            double amount = Double.parseDouble(data[3]);
            String date = data[4];

            transactions.add(
                new Transaction(id, type, category, amount, date)
            );
        }
    } catch (Exception e) {
        System.out.println("Error loading transactions.");
    }
}

public ExpenseManager() {
    loadFromFile();
}


}
