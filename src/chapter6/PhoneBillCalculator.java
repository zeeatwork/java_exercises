package chapter6;

public class PhoneBillCalculator {

    public static void main(String[] args){
        PhoneBill myBill = new PhoneBill("ID7876L",60.99, 1500, 2000,.09,.30);
        double overageRate = myBill.getOverageRate();
        double baseCost = myBill.getBaseCost();
        int minutesUsed = myBill.getMinutesUsed();
        int allottedMinutes = myBill.getAllottedMinutes();
        double overageFee = myBill.calculateOverageAmount(overageRate, minutesUsed,allottedMinutes);
        double taxRate = myBill.getTaxRate();
        double taxDue = myBill.calculateTaxDue(overageFee,baseCost,taxRate);
        myBill.printUserBill(taxDue,baseCost,overageFee);


    }
}
