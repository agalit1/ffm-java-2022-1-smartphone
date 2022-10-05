package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {

    private String model;
    private String manufacturer;
    private List<Contact> contactList;

    public Smartphone() {
        this.model = "";
        this.manufacturer = "";
        this.contactList = new ArrayList<>();
    }

    public Smartphone(String model, String manufacturer, List<Contact> contactList) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contactList = contactList;
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Hamburg";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public void addContact(Contact contact) {
        this.contactList.add(contact);
    }

    public Contact getContact(int index) {
        return this.contactList.get(index);
    }

    public Contact getContactByName(String name) {
        for (Contact contact : this.contactList) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public boolean removeContactByName(String name) {
        return this.contactList.remove(getContactByName(name));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getModel() + "\n");
        sb.append(getManufacturer() + "\n");
        for (Contact contact : getContactList()) {
            sb.append(contact.toString() + "\n");
        }
        return sb.toString();
    }
}
