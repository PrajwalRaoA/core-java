class Pen {
    private String color;
    private String brand;
    private float length;
    private int price;
    private String type;

    static String material = "Plastic";
    static String madeIn = "India";

    public void setColor(String color) { this.color = color; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setLength(float length) { this.length = length; }
    public void setPrice(int price) { this.price = price; }
    public void setType(String type) { this.type = type; }

    public String getColor() { return color; }
    public String getBrand() { return brand; }
    public float getLength() { return length; }
    public int getPrice() { return price; }
    public String getType() { return type; }
}