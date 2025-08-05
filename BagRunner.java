public class BagRunner {
    public static void main(String[] args) {
        Bag bag1 = new Bag();
        bag1.setBrand("Skybags");
        bag1.setColor("Blue");
        bag1.setCapacity(30);
        bag1.setWaterproof(true);
        bag1.setPrice(1200);

        Bag bag2 = new Bag();
        bag2.setBrand("Wildcraft");
        bag2.setColor("Black");
        bag2.setCapacity(35);
        bag2.setWaterproof(true);
        bag2.setPrice(1500);

        Bag bag3 = new Bag();
        bag3.setBrand("American Tourister");
        bag3.setColor("Red");
        bag3.setCapacity(32);
        bag3.setWaterproof(false);
        bag3.setPrice(1800);

        Bag bag4 = new Bag();
        bag4.setBrand("Nike");
        bag4.setColor("Green");
        bag4.setCapacity(28);
        bag4.setWaterproof(true);
        bag4.setPrice(1700);

        Bag bag5 = new Bag();
        bag5.setBrand("Adidas");
        bag5.setColor("Grey");
        bag5.setCapacity(40);
        bag5.setWaterproof(false);
        bag5.setPrice(2000);

        Bag bag6 = new Bag();
        bag6.setBrand("Reebok");
        bag6.setColor("Orange");
        bag6.setCapacity(33);
        bag6.setWaterproof(true);
        bag6.setPrice(1100);

        Bag bag7 = new Bag();
        bag7.setBrand("Puma");
        bag7.setColor("Brown");
        bag7.setCapacity(36);
        bag7.setWaterproof(true);
        bag7.setPrice(1350);

        Bag bag8 = new Bag();
        bag8.setBrand("F Gear");
        bag8.setColor("Purple");
        bag8.setCapacity(31);
        bag8.setWaterproof(true);
        bag8.setPrice(1250);

        Bag bag9 = new Bag();
        bag9.setBrand("HRX");
        bag9.setColor("White");
        bag9.setCapacity(29);
        bag9.setWaterproof(false);
        bag9.setPrice(1450);

        Bag bag10 = new Bag();
        bag10.setBrand("Gear");
        bag10.setColor("Yellow");
        bag10.setCapacity(38);
        bag10.setWaterproof(true);
        bag10.setPrice(1550);

        System.out.println("----- Bag Details -----");
        System.out.println(bag1.getBrand() + " " + bag1.getColor() + " " + bag1.getCapacity() + " " + bag1.getWaterproof() + " " + bag1.getPrice());
        System.out.println(bag2.getBrand() + " " + bag2.getColor() + " " + bag2.getCapacity() + " " + bag2.getWaterproof() + " " + bag2.getPrice());
        System.out.println(bag3.getBrand() + " " + bag3.getColor() + " " + bag3.getCapacity() + " " + bag3.getWaterproof() + " " + bag3.getPrice());
        System.out.println(bag4.getBrand() + " " + bag4.getColor() + " " + bag4.getCapacity() + " " + bag4.getWaterproof() + " " + bag4.getPrice());
        System.out.println(bag5.getBrand() + " " + bag5.getColor() + " " + bag5.getCapacity() + " " + bag5.getWaterproof() + " " + bag5.getPrice());
        System.out.println(bag6.getBrand() + " " + bag6.getColor() + " " + bag6.getCapacity() + " " + bag6.getWaterproof() + " " + bag6.getPrice());
        System.out.println(bag7.getBrand() + " " + bag7.getColor() + " " + bag7.getCapacity() + " " + bag7.getWaterproof() + " " + bag7.getPrice());
        System.out.println(bag8.getBrand() + " " + bag8.getColor() + " " + bag8.getCapacity() + " " + bag8.getWaterproof() + " " + bag8.getPrice());
        System.out.println(bag9.getBrand() + " " + bag9.getColor() + " " + bag9.getCapacity() + " " + bag9.getWaterproof() + " " + bag9.getPrice());
        System.out.println(bag10.getBrand() + " " + bag10.getColor() + " " + bag10.getCapacity() + " " + bag10.getWaterproof() + " " + bag10.getPrice());
    }
}