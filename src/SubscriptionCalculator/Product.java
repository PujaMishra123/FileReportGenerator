package SubscriptionCalculator;

public class Product {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Product(String name, double price, int available, int total) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.total = total;
    }

    double price;
    int available;
    int total;
}
