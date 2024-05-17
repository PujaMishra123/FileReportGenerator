package SubscriptionCalculator;

public enum Month {
            Jan(31,1),
            Feb(28,2),
            March(31,3),
            April(30,4),
            May(31,5),
            June(30,6),
            July(31,7),
            Aug(31,8),
            Sept(30,9),
            Oct(31,10),
            Nov(30,11),
            Dec(31,12);
    private final int num;
    private final int days;
    Month(int days,int num)
    {
        this.days=days;
        this.num=num;
    }
}
