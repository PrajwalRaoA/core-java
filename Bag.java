class Bag {
    private String brand;
    private String color;
    private int capacity;
    private boolean waterproof;
    private int price;
    static String material = "Polyester";
    static boolean hasWheels = false;

    public void setBrand(String brand) { this.brand = brand; }
    public void setColor(String color) { this.color = color; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setWaterproof(boolean waterproof) { this.waterproof = waterproof; }
    public void setPrice(int price) { this.price = price; }

    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public int getCapacity() { return capacity; }
    public boolean getWaterproof() { return waterproof; }
    public int getPrice() { return price; }
}