import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact c) {
        if(this.findContact(c) >= 0 || this.findContact(c.getName()) >= 0)
            return false;
        this.myContacts.add(c);
        return true;
    }

    public boolean updateContact(Contact c1, Contact c2) {
        if(this.myContacts.contains(c1) == false)
            return false;
        this.myContacts.set(this.myContacts.indexOf(c1), c2);
        return true;
    }

    public boolean removeContact(Contact c) {
        if(this.myContacts.contains(c) == false)
            return false;
        this.myContacts.remove(this.myContacts.indexOf(c));
        return true;
    }

    private int findContact(Contact c) {
        return this.myContacts.indexOf(c);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (myContacts.get(i).getName() == name)
                return i;
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (int i = 0; i < this.myContacts.size(); i++) {
            if (myContacts.get(i).getName() == name)
                return myContacts.get(i);
        }
        return null;
    }

    public void printContacts() {
        Contact c;
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            c = this.myContacts.get(i);
            System.out.println(i+1+". "+c.getName()+" -> "+c.getPhoneNumber());
        }
    }

}
