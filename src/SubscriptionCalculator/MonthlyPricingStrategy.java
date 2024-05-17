package SubscriptionCalculator;

public class MonthlyPricingStrategy implements  PricingStrategy{

    @Override
    public double calculate(Subscription subs,Customer c) {
        double price=subs.getP().cost;
        String dateString=subs.getDate();
        String[] d=dateString.split("/");
        int date=Integer.parseInt(d[0]);
        //abstracted by diff date format calculator strategy
        int month=Integer.parseInt(d[1]);
        int discount=c.getM().discount;
        //write the calculation logic here
        return 0;
    }
}
