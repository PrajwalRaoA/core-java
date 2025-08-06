class Hospital {
    private String name;
    private int id;
    private String city;
    private int beds;
    private String type;

    public Hospital() {
    }

    public Hospital(String name, int id) {
        System.out.println("Initializing name and id");
        this.name = name;
        this.id = id;
    }

    public Hospital(String name, int id, String city) {
        this(name, id);
        System.out.println("Initializing city");
        this.city = city;
    }

    public Hospital(String name, int id, String city, int beds) {
        this(name, id, city);
        System.out.println("Initializing beds");
        this.beds = beds;
    }

    public Hospital(String name, int id, String city, int beds, String type) {
        this(name, id, city, beds);
        System.out.println("Initializing type");
        this.type = type;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getCity() { return city; }
    public int getBeds() { return beds; }
    public String getType() { return type; }
}
