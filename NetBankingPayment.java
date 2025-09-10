package com.xworkz.inheritance;

public class NetBankingPayment extends Payment{

    public void makePayment(int amount) {
        System.out.println("Making payment using Netbanking of amount is: " + amount);
    }
}
