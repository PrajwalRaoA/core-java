class ParkRunner {
    public static void main(String[] args) {
        Park[] parks = new Park[5];

        parks[0] = new Park();
        parks[0].setName("Cubbon Park");
        parks[0].setArea("MG Road");

        parks[1] = new Park();
        parks[1].setName("Lalbagh");
        parks[1].setArea("Jayanagar");

        parks[2] = new Park();
        parks[2].setName("Indira Park");
        parks[2].setArea("Hyderabad");

        parks[3] = new Park();
        parks[3].setName("Eco Park");
        parks[3].setArea("Kolkata");

        parks[4] = new Park();
        parks[4].setName("Nehru Park");
        parks[4].setArea("Delhi");

        for (Park p : parks) {
            System.out.println(p.getName());
            System.out.println(p.getArea());
        }
    }
}
