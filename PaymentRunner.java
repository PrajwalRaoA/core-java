package com.xworkz.inheritance;

public class PaymentRunner {
    public static void main(String[] args) {

        CreditCardPayment   creditCardPayment = new CreditCardPayment();
        creditCardPayment.makePayment(10000);

        UpiPayment  upiPayment = new UpiPayment();
        upiPayment.makePayment(1000);

        NetBankingPayment  netBankingPayment = new NetBankingPayment();
        netBankingPayment.makePayment(10000);
    }
}
