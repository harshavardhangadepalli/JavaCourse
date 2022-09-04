public class App {
    public static void main(String[] args) throws Exception {
        MobilePhone mp = new MobilePhone("123445");
        Contact c1 = Contact.createContact("name", "123456");
        Contact c2 = Contact.createContact("name1", "1234564");
        Contact c3 = Contact.createContact("name2", "1234565");
        Contact c4 = Contact.createContact("name3", "1234566");
        Contact c5 = Contact.createContact("name4", "1234567");

        System.out.println(mp.addNewContact(c1));
        mp.printContacts();
        System.out.println(mp.addNewContact(c1));
        mp.printContacts();
    }
}
