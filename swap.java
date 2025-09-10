package com.xworkz.inheritance;

public class swap {
    public static void main(String args[]) {
        int a=10;
        int b=20;
        System.out.println("Before swap");
        System.out.println("a="+a);
        System.out.println("b="+b);
        //int c=a+b;
        //a=c-a;
        //b=c-b;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap");
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
