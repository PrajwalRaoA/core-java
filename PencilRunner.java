public class PencilRunner {
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        p1.setBrand("Apsara");
        p1.setColor("Black");
        p1.setType("HB");
        p1.setLength(15);
        p1.setPrice(5);

        Pencil p2 = new Pencil();
        p2.setBrand("Natraj");
        p2.setColor("Red");
        p2.setType("2B");
        p2.setLength(14);
        p2.setPrice(6);

        Pencil p3 = new Pencil();
        p3.setBrand("Faber");
        p3.setColor("Blue");
        p3.setType("4B");
        p3.setLength(13);
        p3.setPrice(7);

        Pencil p4 = new Pencil();
        p4.setBrand("Doms");
        p4.setColor("Green");
        p4.setType("6B");
        p4.setLength(12);
        p4.setPrice(4);

        Pencil p5 = new Pencil();
        p5.setBrand("Camlin");
        p5.setColor("Yellow");
        p5.setType("8B");
        p5.setLength(11);
        p5.setPrice(8);

        Pencil p6 = new Pencil();
        p6.setBrand("Cello");
        p6.setColor("Orange");
        p6.setType("10B");
        p6.setLength(10);
        p6.setPrice(10);

        Pencil p7 = new Pencil();
        p7.setBrand("Reynolds");
        p7.setColor("Purple");
        p7.setType("HB");
        p7.setLength(9);
        p7.setPrice(5);

        Pencil p8 = new Pencil();
        p8.setBrand("Luxor");
        p8.setColor("Pink");
        p8.setType("2H");
        p8.setLength(13);
        p8.setPrice(6);

        Pencil p9 = new Pencil();
        p9.setBrand("Pentel");
        p9.setColor("White");
        p9.setType("3B");
        p9.setLength(12);
        p9.setPrice(9);

        Pencil p10 = new Pencil();
        p10.setBrand("Staedtler");
        p10.setColor("Grey");
        p10.setType("5B");
        p10.setLength(14);
        p10.setPrice(12);

        System.out.println("----- Pencil Details -----");
        System.out.println(p1.getBrand() + " " + p1.getColor() + " " + p1.getType() + " " + p1.getLength() + " " + p1.getPrice());
        System.out.println(p2.getBrand() + " " + p2.getColor() + " " + p2.getType() + " " + p2.getLength() + " " + p2.getPrice());
        System.out.println(p3.getBrand() + " " + p3.getColor() + " " + p3.getType() + " " + p3.getLength() + " " + p3.getPrice());
        System.out.println(p4.getBrand() + " " + p4.getColor() + " " + p4.getType() + " " + p4.getLength() + " " + p4.getPrice());
        System.out.println(p5.getBrand() + " " + p5.getColor() + " " + p5.getType() + " " + p5.getLength() + " " + p5.getPrice());
        System.out.println(p6.getBrand() + " " + p6.getColor() + " " + p6.getType() + " " + p6.getLength() + " " + p6.getPrice());
        System.out.println(p7.getBrand() + " " + p7.getColor() + " " + p7.getType() + " " + p7.getLength() + " " + p7.getPrice());
        System.out.println(p8.getBrand() + " " + p8.getColor() + " " + p8.getType() + " " + p8.getLength() + " " + p8.getPrice());
        System.out.println(p9.getBrand() + " " + p9.getColor() + " " + p9.getType() + " " + p9.getLength() + " " + p9.getPrice());
        System.out.println(p10.getBrand() + " " + p10.getColor() + " " + p10.getType() + " " + p10.getLength() + " " + p10.getPrice());
    }
}