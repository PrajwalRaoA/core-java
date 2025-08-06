class Library {
    private String name;
    private int id;
    private String city;
    private int numberOfBooks;
    private String type;

    public Library() {
    }

    public Library(String name, int id) {
        System.out.println("Initializing name and id");
        this.name = name;
        this.id = id;
    }

    public Library(String name, int id, String city) {
        this(name, id);
        System.out.println("Initializing city");
        this.city = city;
    }

    public Library(String name, int id, String city, int numberOfBooks) {
        this(name, id, city);
        System.out.println("Initializing number of books");
        this.numberOfBooks = numberOfBooks;
    }

    public Library(String name, int id, String city, int numberOfBooks, String type) {
        this(name, id, city, numberOfBooks);
        System.out.println("Initializing type");
        this.type = type;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public String getCity() { return city; }
    public int getNumberOfBooks() { return numberOfBooks; }
    public String getType() { return type; }
}
