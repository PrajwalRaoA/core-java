class AirportRunner {
    public static void main(String[] args) {
        Airport[] airports = new Airport[5];

        airports[0] = new Airport();
        airports[0].setName("Kempegowda Airport");
        airports[0].setCity("Bangalore");

        airports[1] = new Airport();
        airports[1].setName("Chhatrapati Shivaji Airport");
        airports[1].setCity("Mumbai");

        airports[2] = new Airport();
        airports[2].setName("IGI Airport");
        airports[2].setCity("Delhi");

        airports[3] = new Airport();
        airports[3].setName("Rajiv Gandhi Airport");
        airports[3].setCity("Hyderabad");

        airports[4] = new Airport();
        airports[4].setName("Chennai Airport");
        airports[4].setCity("Chennai");

        for (Airport a : airports) {
            System.out.println(a.getName());
            System.out.println(a.getCity());
        }
    }
}
