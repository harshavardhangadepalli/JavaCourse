import java.util.*;
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactions.add(Double.valueOf(initialTransaction));
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(Double.valueOf(transaction));
    }

}
