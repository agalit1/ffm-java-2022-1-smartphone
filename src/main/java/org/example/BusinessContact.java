package org.example;

public class BusinessContact extends Contact {

    private String companyName;

    public BusinessContact(String name, String companyName, String phoneNumber) {
        super(name, phoneNumber);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String toString() {
        return getName() + " from " + getCompanyName() + " : " + getPhoneNumber();
    }
}
