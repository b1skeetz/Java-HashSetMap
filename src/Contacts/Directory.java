package Contacts;

import java.util.HashSet;
import java.util.Set;

public class Directory {
    private Set<Contact> contacts = new HashSet<>();
    public Set<Contact> getContacts() {
        return contacts;
    }
    public boolean addNewContact(String name, String number, int groupNum){
        return contacts.add(new Contact(name, number, groupNum));
    }
    public void showAll(Set<Contact> contacts){
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
    public void findByNumber(String number){
        Set<Contact> foundContacts = new HashSet<>();
        for (Contact contact : contacts) {
            if(contact.getNumber().contains(number)){
                foundContacts.add(contact);
            }
        }
        if(foundContacts.size() == 0){
            System.out.println("Contacts with this phone number doesn't exist");
        }
        showAll(foundContacts);
    }
}