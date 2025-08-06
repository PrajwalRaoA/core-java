class School {
    private String name;
    private int code;
    private String city;
    private int strength;
    private String type;

    public School() {
    }

    public School(String name, int code) {
        System.out.println("Initializing name and code");
        this.name = name;
        this.code = code;
    }

    public School(String name, int code, String city) {
        this(name, code);
        System.out.println("Initializing city");
        this.city = city;
    }

    public School(String name, int code, String city, int strength) {
        this(name, code, city);
        System.out.println("Initializing strength");
        this.strength = strength;
    }

    public School(String name, int code, String city, int strength, String type) {
        this(name, code, city, strength);
        System.out.println("Initializing type");
        this.type = type;
    }

    public String getName() { 
    return name;
    }
    public int getCode() { 
     return code; 
    }
    public String getCity() { 
     return city; 
    }
    public int getStrength() { 
     return strength; 
     }
    public String getType() {  
     return type; 
    }
}
