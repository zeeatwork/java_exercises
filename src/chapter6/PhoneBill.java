package chapter6;

public class PhoneBill {
    private String iD;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private double taxRate;
    private  double overageRate;


    public PhoneBill() {
        iD = "ID000000";
        baseCost = 19.99;
        allottedMinutes = 10000;
        minutesUsed = 0;
        taxRate = .15;
        overageRate = .25;
    }

    public PhoneBill(String iD) {
        setId(iD);
        baseCost = 19.99;
        allottedMinutes = 10000;
        minutesUsed = 0;
        taxRate = .15;
        overageRate = .25;
    }

    public PhoneBill(String iD, double baseCost, int allottedMinutes, int minutesUsed, double taxRate, double overageRate) {
        setAllottedMinutes(allottedMinutes);
        setBaseCost(baseCost);
        setId(iD);
        setMinutesUsed(minutesUsed);
        setOverageRate(overageRate);
        setTaxRate(taxRate);
    }

    public String getId() {
        return iD;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getOverageRate() {
        return overageRate;
    }

    public void setId(String iD) {
        this.iD = iD;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setOverageRate(double overageRate) {
        this.overageRate = overageRate;
    }

    public double calculateOverageAmount(double overageRate, int minutesUsed, int allottedMinutes){
    double overageFee = (minutesUsed - allottedMinutes) * overageRate;
    if (overageFee < 0) {
        overageFee = 0;
    }
        return overageFee;
    }

    public double calculateTaxDue(double overageFee, double baseCost, double taxRate){
        double taxDue = (overageFee + baseCost) * taxRate;
        return taxDue;
    }

    public void printUserBill(double taxDue, double baseCost, double overageFee){
        System.out.println("With a base cost of $" + baseCost + " and an over fee of  $" + overageFee + " incurred, the tax will be $" + taxDue + ". Your total bill this month is $" + (baseCost + taxDue + overageFee) );
    }
}
