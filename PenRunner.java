public class PenRunner {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.setBrand("Cello");
        pen1.setLength(14.5f);
        pen1.setPrice(10);
        pen1.setType("Ball");

        Pen pen2 = new Pen();
        pen2.setColor("Black");
        pen2.setBrand("Reynolds");
        pen2.setLength(15.0f);
        pen2.setPrice(12);
        pen2.setType("Gel");

        Pen pen3 = new Pen();
        pen3.setColor("Red");
        pen3.setBrand("Parker");
        pen3.setLength(13.0f);
        pen3.setPrice(20);
        pen3.setType("Fountain");

        Pen pen4 = new Pen();
        pen4.setColor("Green");
        pen4.setBrand("Classmate");
        pen4.setLength(14.0f);
        pen4.setPrice(8);
        pen4.setType("Sketch");

        Pen pen5 = new Pen();
        pen5.setColor("Purple");
        pen5.setBrand("Linc");
        pen5.setLength(13.5f);
        pen5.setPrice(15);
        pen5.setType("Gel");

        Pen pen6 = new Pen();
        pen6.setColor("Orange");
        pen6.setBrand("Pilot");
        pen6.setLength(14.0f);
        pen6.setPrice(18);
        pen6.setType("Ball");

        Pen pen7 = new Pen();
        pen7.setColor("Pink");
        pen7.setBrand("Flair");
        pen7.setLength(13.7f);
        pen7.setPrice(16);
        pen7.setType("Marker");

        Pen pen8 = new Pen();
        pen8.setColor("Grey");
        pen8.setBrand("Uniball");
        pen8.setLength(14.3f);
        pen8.setPrice(22);
        pen8.setType("Fine Tip");

        Pen pen9 = new Pen();
        pen9.setColor("Brown");
        pen9.setBrand("Lamy");
        pen9.setLength(13.8f);
        pen9.setPrice(30);
        pen9.setType("Fountain");

        Pen pen10 = new Pen();
        pen10.setColor("Yellow");
        pen10.setBrand("Camlin");
        pen10.setLength(14.1f);
        pen10.setPrice(9);
        pen10.setType("Sketch");

        System.out.println("--- Pen Details ---");
        System.out.println(pen1.getColor() + " " + pen1.getBrand() + " " + pen1.getLength() + " " + pen1.getPrice() + " " + pen1.getType());
        System.out.println(pen2.getColor() + " " + pen2.getBrand() + " " + pen2.getLength() + " " + pen2.getPrice() + " " + pen2.getType());
        System.out.println(pen3.getColor() + " " + pen3.getBrand() + " " + pen3.getLength() + " " + pen3.getPrice() + " " + pen3.getType());
        System.out.println(pen4.getColor() + " " + pen4.getBrand() + " " + pen4.getLength() + " " + pen4.getPrice() + " " + pen4.getType());
        System.out.println(pen5.getColor() + " " + pen5.getBrand() + " " + pen5.getLength() + " " + pen5.getPrice() + " " + pen5.getType());
        System.out.println(pen6.getColor() + " " + pen6.getBrand() + " " + pen6.getLength() + " " + pen6.getPrice() + " " + pen6.getType());
        System.out.println(pen7.getColor() + " " + pen7.getBrand() + " " + pen7.getLength() + " " + pen7.getPrice() + " " + pen7.getType());
        System.out.println(pen8.getColor() + " " + pen8.getBrand() + " " + pen8.getLength() + " " + pen8.getPrice() + " " + pen8.getType());
        System.out.println(pen9.getColor() + " " + pen9.getBrand() + " " + pen9.getLength() + " " + pen9.getPrice() + " " + pen9.getType());
        System.out.println(pen10.getColor() + " " + pen10.getBrand() + " " + pen10.getLength() + " " + pen10.getPrice() + " " + pen10.getType());
    }
}