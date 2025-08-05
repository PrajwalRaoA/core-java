class BookstoreRunner {
    public static void main(String[] args) {
        Bookstore[] stores = new Bookstore[5];

        stores[0] = new Bookstore();
        stores[0].setName("Sapna Book House");
        stores[0].setArea("Jayanagar");

        stores[1] = new Bookstore();
        stores[1].setName("Crossword");
        stores[1].setArea("Koramangala");

        stores[2] = new Bookstore();
        stores[2].setName("Landmark");
        stores[2].setArea("Indiranagar");

        stores[3] = new Bookstore();
        stores[3].setName("Higginbothams");
        stores[3].setArea("MG Road");

        stores[4] = new Bookstore();
        stores[4].setName("Bookworm");
        stores[4].setArea("Whitefield");

        for (Bookstore b : stores) {
            System.out.println(b.getName());
            System.out.println(b.getArea());
        }
    }
}