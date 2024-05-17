package SubscriptionCalculator;

public class PriceCalculator {
    PricingStrategy st;
    PriceCalculator(PricingStrategy st)
    {
        this.st=st;
    }
    double calculate(Customer cust,Product p,Subscription subs)
    {
        return st.calculate(subs,cust);

    }
}
