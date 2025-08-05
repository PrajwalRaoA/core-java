public class Phone {
    private String model;
    private String os;
    private int ram;
    private double cost;

    public static String category;

    static {
        System.out.println("Static block in Phone");
        category = "Smartphone";
    }

    {
        System.out.println("Non-static block in Phone");
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public double getCost() {
        return cost;
    }
}