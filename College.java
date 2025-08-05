public class College {
    private String name;
    private int code;
    private String city;

    int[] departments = {5, 10, 15};
    int[] staffCounts = {20, 25, 30};
    static String[] deanNames = {"Dr. Rao", "Dr. Meena", "Dr. Sharma"};

    public static String[] getDeanNames() {
        return deanNames;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
}
