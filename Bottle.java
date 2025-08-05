class Bottle {
    private String brand;
    private String color;
    private int capacity;
    private boolean isInsulated;
    private double price;
    static String material = "Stainless Steel";
    static boolean reusable = true;

    public void setBrand(String brand) { this.brand = brand; }
    public void setColor(String color) { this.color = color; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public void setIsInsulated(boolean isInsulated) { this.isInsulated = isInsulated; }
    public void setPrice(double price) { this.price = price; }

    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public int getCapacity() { return capacity; }
    public boolean getIsInsulated() { return isInsulated; }
    public double getPrice() { return price; }
}