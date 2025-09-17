package com.xworkz.abstraction;

public class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}
