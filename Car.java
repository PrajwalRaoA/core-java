public class Car {
    private String model;
    private String fuelType;
    private String transmission;
    private double price;

    public static int wheels;

    static {
        System.out.println("Static block in Car");
        wheels = 4;
    }

    {
        System.out.println("Non-static block in Car");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public double getPrice() {
        return price;
    }
}