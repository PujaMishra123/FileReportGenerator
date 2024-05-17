package SubscriptionCalculator;

public class Customer {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    String name;
    String dob;
    String address;

    public Membership getM() {
        return m;
    }

    public void setM(Membership m) {
        this.m = m;
    }

    Membership m;

    public Customer(String name, String dob, String address,Membership m) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.m=m;
    }
}
