package chapter5;

import java.util.Scanner;

public class PhoneBillExercise {

    //Initialize the known values
    static double overChargeRate = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Get the unknown values
        double planFee = getPlanFee();
        int overChargeMinutes = getOverChargeMinutes();
        scanner.close();

        //Calculations
        double overCharge = calculateOverCharge(overChargeMinutes, overChargeRate);
        double tax = calculateTax(taxRate, planFee, overCharge);
        double total = calculateTotal(planFee, overCharge, tax);

        //Print statement
        printStatement(planFee, overCharge, tax, total);
    }

    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan:");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static int getOverChargeMinutes() {
        System.out.println("Enter overcharge minutes:");
        int overChargeMinutes = scanner.nextInt();
        return overChargeMinutes;
    }

    public static double calculateOverCharge(int overChargeMinute, double overChargeRate) {
        return overChargeMinute * overChargeRate;
    }

    public static double calculateTax(double taxRate, double planFee, double overCharge) {
        double totalWithoutTax = planFee+overCharge;
        double totalWithTax = totalWithoutTax*taxRate;
        return totalWithTax;
    }

    public static double calculateTotal(double planFee, double overCharge, double tax) {
        return planFee+overCharge+tax;
    }

    public static void printStatement(double planFee, double overCharge, double tax, double total) {
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overcharge: $" + overCharge);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
