public class NotebookRunner {
    public static void main(String[] args) {
        Notebook nb1 = new Notebook();
        nb1.setBrand("Classmate");
        nb1.setSize("A4");
        nb1.setPages(200);
        nb1.setColor("Red");
        nb1.setPrice(40);

        Notebook nb2 = new Notebook();
        nb2.setBrand("Navneet");
        nb2.setSize("A5");
        nb2.setPages(150);
        nb2.setColor("Blue");
        nb2.setPrice(35);

        Notebook nb3 = new Notebook();
        nb3.setBrand("Camlin");
        nb3.setSize("B5");
        nb3.setPages(300);
        nb3.setColor("Black");
        nb3.setPrice(50);

        Notebook nb4 = new Notebook();
        nb4.setBrand("JK Paper");
        nb4.setSize("A4");
        nb4.setPages(180);
        nb4.setColor("White");
        nb4.setPrice(38);

        Notebook nb5 = new Notebook();
        nb5.setBrand("Pigeon");
        nb5.setSize("A6");
        nb5.setPages(100);
        nb5.setColor("Green");
        nb5.setPrice(20);

        Notebook nb6 = new Notebook();
        nb6.setBrand("Paperkraft");
        nb6.setSize("A5");
        nb6.setPages(250);
        nb6.setColor("Yellow");
        nb6.setPrice(45);

        Notebook nb7 = new Notebook();
        nb7.setBrand("Sundaram");
        nb7.setSize("A4");
        nb7.setPages(120);
        nb7.setColor("Pink");
        nb7.setPrice(30);

        Notebook nb8 = new Notebook();
        nb8.setBrand("Flair");
        nb8.setSize("B4");
        nb8.setPages(220);
        nb8.setColor("Orange");
        nb8.setPrice(42);

        Notebook nb9 = new Notebook();
        nb9.setBrand("Neelgagan");
        nb9.setSize("A3");
        nb9.setPages(160);
        nb9.setColor("Purple");
        nb9.setPrice(37);

        Notebook nb10 = new Notebook();
        nb10.setBrand("Luxor");
        nb10.setSize("A5");
        nb10.setPages(190);
        nb10.setColor("Grey");
        nb10.setPrice(36);

   
        System.out.println("--- Notebook Details ---");
        System.out.println(nb1.getBrand() + " " + nb1.getSize() + " " + nb1.getPages() + " " + nb1.getColor() + " " + nb1.getPrice());
        System.out.println(nb2.getBrand() + " " + nb2.getSize() + " " + nb2.getPages() + " " + nb2.getColor() + " " + nb2.getPrice());
        System.out.println(nb3.getBrand() + " " + nb3.getSize() + " " + nb3.getPages() + " " + nb3.getColor() + " " + nb3.getPrice());
        System.out.println(nb4.getBrand() + " " + nb4.getSize() + " " + nb4.getPages() + " " + nb4.getColor() + " " + nb4.getPrice());
        System.out.println(nb5.getBrand() + " " + nb5.getSize() + " " + nb5.getPages() + " " + nb5.getColor() + " " + nb5.getPrice());
        System.out.println(nb6.getBrand() + " " + nb6.getSize() + " " + nb6.getPages() + " " + nb6.getColor() + " " + nb6.getPrice());
        System.out.println(nb7.getBrand() + " " + nb7.getSize() + " " + nb7.getPages() + " " + nb7.getColor() + " " + nb7.getPrice());
        System.out.println(nb8.getBrand() + " " + nb8.getSize() + " " + nb8.getPages() + " " + nb8.getColor() + " " + nb8.getPrice());
        System.out.println(nb9.getBrand() + " " + nb9.getSize() + " " + nb9.getPages() + " " + nb9.getColor() + " " + nb9.getPrice());
        System.out.println(nb10.getBrand() + " " + nb10.getSize() + " " + nb10.getPages() + " " + nb10.getColor() + " " + nb10.getPrice());
    }
}