package com.xworkz.abstraction;

public interface Payment {
    void pay(double amount);

    void refund(double amount);
}
