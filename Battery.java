class Battery {
    private int capacity;
    private String type;
    private String manufacturer;

    public Battery(int capacity, String type, String manufacturer) {
        this.capacity = capacity;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public int getCapacity() { return capacity; }
    public String getType() { return type; }
    public String getManufacturer() { return manufacturer; }
}