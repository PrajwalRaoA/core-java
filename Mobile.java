class Mobile {
    private String brand;
    private String model;
    private double price;
    private String color;
    private Battery battery; // dependent class

    public Mobile(String brand, String model, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public Mobile(String brand, String model, double price, String color, Battery battery) {
        this(brand, model, price, color);
        this.battery = battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
}

