package org.example;

public class Friend extends Contact {

    public Friend() {
        super("", "");
    }

    //constructor with two parameters
    public Friend(String name, String phoneNumber) {
        super(name, phoneNumber);
    }

    @Override
    public String toString() {
        return getName() + " : " + getPhoneNumber();
    }
}
