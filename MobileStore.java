class MobileStore {
    private String name;
    private int id;
    private String city;
    private int modelsAvailable;
    private String brandFocus;

    public MobileStore() {
    }

    public MobileStore(String name, int id) {
        System.out.println("Initializing name and id");
        this.name = name;
        this.id = id;
    }

    public MobileStore(String name, int id, String city) {
        this(name, id);
        System.out.println("Initializing city");
        this.city = city;
    }

    public MobileStore(String name, int id, String city, int modelsAvailable) {
        this(name, id, city);
        System.out.println("Initializing modelsAvailable");
        this.modelsAvailable = modelsAvailable;
    }

    public MobileStore(String name, int id, String city, int modelsAvailable, String brandFocus) {
        this(name, id, city, modelsAvailable);
        System.out.println("Initializing brandFocus");
        this.brandFocus = brandFocus;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getCity() { return city; }
    public int getModelsAvailable() { return modelsAvailable; }
    public String getBrandFocus() { return brandFocus; }
}
