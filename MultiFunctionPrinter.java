package com.xworkz.abstraction;

public class MultiFunctionPrinter implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scanDocument(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void sendFax(String document) {
        System.out.println("Sending fax: " + document);
    }
}

