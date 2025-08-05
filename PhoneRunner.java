public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.setModel("Galaxy A10");
        phone1.setOs("Android");
        phone1.setRam(4);
        phone1.setCost(12000);

        Phone phone2 = new Phone();
        phone2.setModel("iPhone 12");
        phone2.setOs("iOS");
        phone2.setRam(6);
        phone2.setCost(70000);

        Phone phone3 = new Phone();
        phone3.setModel("Pixel 6");
        phone3.setOs("Android");
        phone3.setRam(8);
        phone3.setCost(50000);

        Phone phone4 = new Phone();
        phone4.setModel("Realme 9");
        phone4.setOs("Android");
        phone4.setRam(6);
        phone4.setCost(15000);

        Phone phone5 = new Phone();
        phone5.setModel("Nokia G20");
        phone5.setOs("Android");
        phone5.setRam(4);
        phone5.setCost(13000);

        Phone phone6 = new Phone();
        phone6.setModel("OnePlus 10");
        phone6.setOs("Android");
        phone6.setRam(12);
        phone6.setCost(40000);

        Phone phone7 = new Phone();
        phone7.setModel("Redmi Note 11");
        phone7.setOs("Android");
        phone7.setRam(6);
        phone7.setCost(18000);

        Phone phone8 = new Phone();
        phone8.setModel("Vivo V23");
        phone8.setOs("Android");
        phone8.setRam(8);
        phone8.setCost(22000);

        Phone phone9 = new Phone();
        phone9.setModel("Moto G62");
        phone9.setOs("Android");
        phone9.setRam(6);
        phone9.setCost(17000);

        Phone phone10 = new Phone();
        phone10.setModel("Samsung M13");
        phone10.setOs("Android");
        phone10.setRam(4);
        phone10.setCost(11000);

        printPhone(phone1, 1);
        printPhone(phone2, 2);
        printPhone(phone3, 3);
        printPhone(phone4, 4);
        printPhone(phone5, 5);
        printPhone(phone6, 6);
        printPhone(phone7, 7);
        printPhone(phone8, 8);
        printPhone(phone9, 9);
        printPhone(phone10, 10);
    }

    public static void printPhone(Phone phone, int number) {
        System.out.println("\nPhone " + number);
        System.out.println("Model: " + phone.getModel());
        System.out.println("OS: " + phone.getOs());
        System.out.println("RAM: " + phone.getRam());
        System.out.println("Cost: " + phone.getCost());
        System.out.println("Category: " + Phone.category);
    }
}