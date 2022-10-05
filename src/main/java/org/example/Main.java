package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList to store all the contacts with name and number
        ArrayList<Contact> list = new ArrayList<>();

        // Create new contacts
        Friend newContact1 = new Friend("Alex", "+49 1235649680");
        Friend newContact2 = new Friend("John", "+49 1845649098");
        Friend newContact3 = new Friend("Andre", "+49 1835649983");

        // Add contacts to list
        list.add(newContact1);
        list.add(newContact2);
        list.add(newContact3);

        // Create smartphone
        Smartphone smartphone = new Smartphone("Samsung Galaxy", "Samsung", list);
        System.out.println(smartphone);

        // Create new contacts and add
        BusinessContact newContact4 = new BusinessContact("Jonas", "NXP", "+49 1838649983");
        BusinessContact newContact5 = new BusinessContact("Nick", "NXP", "+49 1838549983");
        smartphone.addContact(newContact4);
        smartphone.addContact(newContact5);
        System.out.println("Added two new contacts:");
        System.out.println(smartphone);

        // Find contact by name
        System.out.println("Searching for Nick:");
        Contact foundContact = smartphone.getContactByName("Nick");
        System.out.println(foundContact + "\n");

        // Remove contact by name
        System.out.println("Removed contact (Jonas):");
        smartphone.removeContactByName("Jonas");
        System.out.println(smartphone);

    }
}