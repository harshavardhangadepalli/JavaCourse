import java.util.*;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String nameOfCustomer, double initialTransaction) {
        if(this.findCustomer(nameOfCustomer) != null)
            return false;
        Customer newCustomer = new Customer(nameOfCustomer, initialTransaction);
        this.customers.add(newCustomer);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfCustomer, double transaction) {
        if (this.findCustomer(nameOfCustomer) == null)
            return false;
        Customer c = findCustomer(nameOfCustomer);
        c.addTransaction(transaction);
        return true;
    }

    private Customer findCustomer(String nameOfCustomer) {
        for (int i = 0; i < this.customers.size(); i++) {
            if(this.customers.get(i).getName() == nameOfCustomer)
                return this.customers.get(i);
        }
        return null;
    }

}
