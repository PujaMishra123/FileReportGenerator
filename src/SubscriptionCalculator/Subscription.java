package SubscriptionCalculator;

public class Subscription {
    public Plan getP() {
        return p;
    }

    public Subscription(Plan p, String date) {
        this.p = p;
        this.date = date;
    }

    public void setP(Plan p) {
        this.p = p;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    Plan p;
    String date;
}
