package ContactListApplication;

import details.Person;

import java.util.ArrayList;

public class ContactListApplication {
    private ArrayList<Person> contactList = new ArrayList<>();

    public void add(String firstName, String lastName, String contactNumber, String emailAddress) {
        contactList.add(new Person(firstName, lastName, contactNumber, emailAddress));
    }

    public ArrayList<Person> getContactList() {
        return contactList;
    }

    public void print() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
}
