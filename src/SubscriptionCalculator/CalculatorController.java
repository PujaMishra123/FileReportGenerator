package SubscriptionCalculator;

public class CalculatorController {
    public static void main(String[] args)
    {
        //calculate(cust,prod,subsPlan,date)
        //assuming format is dd-mm-yy,dd/mm/yy supporting these formats
        PriceCalculator obj=new PriceCalculator(new MonthlyPricingStrategy());//can change strategy here
        obj.calculate(new Customer("Raj","02/12/24","shanti nagar",Membership.Gold),new Product("Tag",12.50,1,12),new Subscription(Plan.Basic,"23/12/24"));
    }
}
