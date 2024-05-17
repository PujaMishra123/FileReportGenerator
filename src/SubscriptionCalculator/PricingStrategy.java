package SubscriptionCalculator;

public interface PricingStrategy {
    double calculate(Subscription sub,Customer c);
}
