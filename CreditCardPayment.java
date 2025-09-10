package com.xworkz.inheritance;

public class CreditCardPayment extends Payment {
    public void makePayment(int amount) {
        System.out.println("Making payment using credit card of amount is: " + amount);
    }
}
