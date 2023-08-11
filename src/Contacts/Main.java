package Contacts;

public class Main {
    public static void main(String[] args) {
        Directory dir = new Directory();
        dir.addNewContact("Maksim", "+7 701 664 36 77", 2);
        dir.addNewContact("Maksim", "+7 701 664 36 77", 2);
        dir.addNewContact("Oleg", "+7 702 664 88 66", 1);
        dir.showAll(dir.getContacts());
        System.out.println("----------------------");
        dir.findByNumber("664");
    }
}