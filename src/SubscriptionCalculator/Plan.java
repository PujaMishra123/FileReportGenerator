package SubscriptionCalculator;

public enum Plan {
    Basic(9.99),
    Standard(49.99),
    Premium(249.99);
    public final double cost;

    private Plan(double cost) {
        this.cost = cost;
    }
}
