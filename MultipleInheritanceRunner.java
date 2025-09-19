package com.xworkz.abstraction;

public class MultipleInheritanceRunner  {
    public static void main(String[] args) {

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.printDocument("Java Notes");
        mfp.scanDocument("Project Report");
        mfp.sendFax("Invoice.pdf");

        System.out.println("----------- Using Upcasting -----------");

        Printer printer = new MultiFunctionPrinter();
        printer.printDocument("Resume.pdf");

        Scanner scanner = new MultiFunctionPrinter();
        scanner.scanDocument("ID Proof");

        FaxMachine fax = new MultiFunctionPrinter();
        fax.sendFax("Offer Letter");
    }
}
