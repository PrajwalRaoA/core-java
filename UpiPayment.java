package com.xworkz.inheritance;

public class UpiPayment extends Payment {
    public void makePayment(int amount) {
        System.out.println("Making payment using Upi of amount is: " + amount);
    }
}
