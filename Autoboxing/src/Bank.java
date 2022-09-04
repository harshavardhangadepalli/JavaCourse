import java.util.*;
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if(this.findBranch(name) != null)
            return false;
        Branch b = new Branch(name);
        this.branches.add(b);
        return true;
    }

    public boolean addCustomer(String nameOfBranch, String nameOfCustomer, double initialTransaction) {
        if (this.findBranch(nameOfBranch) == null)
            return false;
        Branch b = findBranch(nameOfBranch);
        ArrayList<Customer> customers = b.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getName() == nameOfCustomer)
                return false;
        }
        b.newCustomer(nameOfCustomer, initialTransaction);
        return true;
    }

    public boolean addCustomerTransaction(String nameOfBranch, String nameOfCustomer, double transaction) {
        if (this.findBranch(nameOfBranch) == null)
            return false;
        Branch b = this.findBranch(nameOfBranch);
        boolean ret = b.addCustomerTransaction(nameOfCustomer, transaction);
        return ret;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < this.branches.size(); i++) {
            if(this.branches.get(i).getName() == name)
                return branches.get(i);
        }
        return null;
    }

    public boolean listCustomers(String nameOfBranch, boolean printTransactions) {
        if(this.findBranch(nameOfBranch) == null)
            return false;
        return true;
    }
}
