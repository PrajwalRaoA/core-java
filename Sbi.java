package com.xworkz.inheritance;

public class Sbi extends Bank {
    public Sbi() {

    }
    public Sbi(String timing) {
        this.timing = timing;
    }
    public float getRateOfInterest() {
        return 7.0f;
    }
}
