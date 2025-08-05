public class Restaurant {
    private String name;
    private int licenseNo;
    private String cuisineType;

    int[] tableCounts = {5, 10, 15};
    int[] chefCounts = {2, 3, 4};
    static String[] managerNames = {"Ajay", "Sunita", "Gopal"};

    public static String[] getManagerNames() {
        return managerNames;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
    public String getCuisineType() {
        return cuisineType;
    }
}
