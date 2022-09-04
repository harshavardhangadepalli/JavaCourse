import java.util.*;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item) {
        this.groceryList.add(item);
    }

    public void printList() {
        System.out.println("You have " + this.groceryList.size());
        for (int i = 0; i < this.groceryList.size(); i++) {
            System.out.println(this.groceryList.get(i));
        }
    }

    public void modifyItem(int position, String newItem) {
        groceryList.set(position, newItem);
    }

    public void removeItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
    }

    public boolean findItem(String searchItem) {
        boolean b = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position < -1)
            return false;
        return true;
    }
}