class Pencil {
    private String brand;
    private String color;
    private String type;
    private int length;
    private int price;
    static String material = "Wood";
    static boolean isSharpenable = true;

    public void setBrand(String brand) { this.brand = brand; }
    public void setColor(String color) { this.color = color; }
    public void setType(String type) { this.type = type; }
    public void setLength(int length) { this.length = length; }
    public void setPrice(int price) { this.price = price; }

    public String getBrand() { return brand; }
    public String getColor() { return color; }
    public String getType() { return type; }
    public int getLength() { return length; }
    public int getPrice() { return price; }
}