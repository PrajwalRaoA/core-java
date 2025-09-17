package com.xworkz.abstraction;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        p1.pay(2000);
        p1.refund(500);
        p2.pay(1500);
        p2.refund(300);
    }
}
