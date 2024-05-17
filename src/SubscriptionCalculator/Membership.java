package SubscriptionCalculator;

public enum Membership {
    Gold(4),Silver(3),Platinum(2);
    final int discount;
    Membership(int disc)
    {
        this.discount=disc;
    }
}
