public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle();
        bottle1.setBrand("Milton");
        bottle1.setColor("Silver");
        bottle1.setCapacity(1000);
        bottle1.setIsInsulated(true);
        bottle1.setPrice(450.0);

        Bottle bottle2 = new Bottle();
        bottle2.setBrand("Cello");
        bottle2.setColor("Blue");
        bottle2.setCapacity(750);
        bottle2.setIsInsulated(false);
        bottle2.setPrice(300.0);

        Bottle bottle3 = new Bottle();
        bottle3.setBrand("Tupperware");
        bottle3.setColor("Red");
        bottle3.setCapacity(500);
        bottle3.setIsInsulated(true);
        bottle3.setPrice(550.0);

        Bottle bottle4 = new Bottle();
        bottle4.setBrand("Pigeon");
        bottle4.setColor("Green");
        bottle4.setCapacity(850);
        bottle4.setIsInsulated(false);
        bottle4.setPrice(400.0);

        Bottle bottle5 = new Bottle();
        bottle5.setBrand("Signoraware");
        bottle5.setColor("Black");
        bottle5.setCapacity(700);
        bottle5.setIsInsulated(true);
        bottle5.setPrice(600.0);

        Bottle bottle6 = new Bottle();
        bottle6.setBrand("Borosil");
        bottle6.setColor("White");
        bottle6.setCapacity(650);
        bottle6.setIsInsulated(false);
        bottle6.setPrice(420.0);

        Bottle bottle7 = new Bottle();
        bottle7.setBrand("Tupperware");
        bottle7.setColor("Yellow");
        bottle7.setCapacity(950);
        bottle7.setIsInsulated(true);
        bottle7.setPrice(700.0);

        Bottle bottle8 = new Bottle();
        bottle8.setBrand("Milton");
        bottle8.setColor("Brown");
        bottle8.setCapacity(600);
        bottle8.setIsInsulated(false);
        bottle8.setPrice(390.0);

        Bottle bottle9 = new Bottle();
        bottle9.setBrand("Cello");
        bottle9.setColor("Grey");
        bottle9.setCapacity(500);
        bottle9.setIsInsulated(true);
        bottle9.setPrice(480.0);

        Bottle bottle10 = new Bottle();
        bottle10.setBrand("Signoraware");
        bottle10.setColor("Pink");
        bottle10.setCapacity(800);
        bottle10.setIsInsulated(true);
        bottle10.setPrice(670.0);

        System.out.println("----- Bottle Details -----");
        System.out.println(bottle1.getBrand() + " " + bottle1.getColor() + " " + bottle1.getCapacity() + " " + bottle1.getIsInsulated() + " " + bottle1.getPrice());
        System.out.println(bottle2.getBrand() + " " + bottle2.getColor() + " " + bottle2.getCapacity() + " " + bottle2.getIsInsulated() + " " + bottle2.getPrice());
        System.out.println(bottle3.getBrand() + " " + bottle3.getColor() + " " + bottle3.getCapacity() + " " + bottle3.getIsInsulated() + " " + bottle3.getPrice());
        System.out.println(bottle4.getBrand() + " " + bottle4.getColor() + " " + bottle4.getCapacity() + " " + bottle4.getIsInsulated() + " " + bottle4.getPrice());
        System.out.println(bottle5.getBrand() + " " + bottle5.getColor() + " " + bottle5.getCapacity() + " " + bottle5.getIsInsulated() + " " + bottle5.getPrice());
        System.out.println(bottle6.getBrand() + " " + bottle6.getColor() + " " + bottle6.getCapacity() + " " + bottle6.getIsInsulated() + " " + bottle6.getPrice());
        System.out.println(bottle7.getBrand() + " " + bottle7.getColor() + " " + bottle7.getCapacity() + " " + bottle7.getIsInsulated() + " " + bottle7.getPrice());
        System.out.println(bottle8.getBrand() + " " + bottle8.getColor() + " " + bottle8.getCapacity() + " " + bottle8.getIsInsulated() + " " + bottle8.getPrice());
        System.out.println(bottle9.getBrand() + " " + bottle9.getColor() + " " + bottle9.getCapacity() + " " + bottle9.getIsInsulated() + " " + bottle9.getPrice());
        System.out.println(bottle10.getBrand() + " " + bottle10.getColor() + " " + bottle10.getCapacity() + " " + bottle10.getIsInsulated() + " " + bottle10.getPrice());
    }
}