public class RestaurantArrayRunner {
    public static void main(String[] args) {
        Restaurant[] restaurants = new Restaurant[5];

        for (int i = 0; i < restaurants.length; i++) {
            restaurants[i] = new Restaurant();
            restaurants[i].setName("Restaurant " + (i + 1));
            restaurants[i].setCuisineType("Cuisine " + (i + 1));
        }

        for (int i = 0; i < restaurants.length; i++) {
            System.out.println("Restaurant ===== " + (i + 1));
            System.out.println(restaurants[i].getName());
            System.out.println(restaurants[i].getCuisineType());
        }
    }
}
