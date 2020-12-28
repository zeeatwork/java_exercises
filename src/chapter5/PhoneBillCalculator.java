package chapter5;

/*
Calculate the total of a user's phone bill.
The operator will enter the plan fee and the number of overage minutes.
Each user pays .25 for every minute of plan overage and 15% tax on the subtotal.
Create 3 methods: calculateTax, calculateOverageFees, calculateTotal/displayItemizedBill.
 */

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);
    static double overageRate = .25;
    static double taxRate = .15;
    public static void main(String[] args) {

        double basePlanFee = getPlanCost();
    int overageMinutes = getOverageMinutes();
   scanner.close();

    double overageTotal = calculateOverageFee(overageMinutes, basePlanFee);
    double taxDue = calculateTax(overageTotal, basePlanFee);
    displayItemizedBill(basePlanFee,overageTotal,taxDue);

    }
    public static double getPlanCost(){
        System.out.println("Thank you for using our our bill calculator.  I'll need some information from you to get started." +
                "Please enter the base monthly cost of your phone bill.");
      double basePlanFee = scanner.nextDouble();
        return basePlanFee;
    }

    public static int getOverageMinutes(){
        boolean isValidInput = false;
        int overageMinutes = 0;
       while(!isValidInput){
           System.out.println("Your plan allows for 1,000 of fee talk time! How many minutes over that amount did you speak?");
           overageMinutes = scanner.nextInt();
           if (overageMinutes >= 0){
               isValidInput = true;
           } else {
               System.out.println("Invalid entry.  Please enter 0 or more.");
           }
       }
       return overageMinutes;
    }

    public static double calculateOverageFee(int overageMinutes, double basePlanFee) {
        double overageTotal = overageMinutes * overageRate;
        return overageTotal;
    }

    public static double calculateTax(double overageTotal, double basePlanFee) {
        double taxDue = (overageTotal + basePlanFee) * taxRate;
        return taxDue;
    }

    public static void displayItemizedBill(double basePlanFee, double overageTotal, double taxDue){
        System.out.println("==============================================================");
        System.out.println("=====================Phone Bill Statement=====================");
        System.out.println("Plan Cost: $" + basePlanFee);
        System.out.println("Overage Fee: $"+ overageTotal);
        System.out.println("SUBTOTAL:  $" + (basePlanFee + overageTotal));
        System.out.println("Tax Due: $" + taxDue);
        System.out.println("Your bill total is:  $" + (basePlanFee + overageTotal + taxDue));
        System.out.println("==============================================================");
    }
}
