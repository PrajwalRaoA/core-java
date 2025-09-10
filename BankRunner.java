package com.xworkz.inheritance;

public class BankRunner {
    public static void main(String[] args) {
        Bank sbi = new Sbi("9:30 to 4");
        System.out.println("rate of interest for SBI is: " + sbi.getRateOfInterest());
        System.out.println("Timing of Sbi is" + sbi.timing);
        Bank axis = new Axis();
        System.out.println("rate of interest for Axis is: " + axis.getRateOfInterest());
        System.out.println("Timing of Axis is" + axis.timing);
    }
}
