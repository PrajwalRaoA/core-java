class DependentClassesRunner {
    public static void main(String[] args) {

        Mobile mobile = new Mobile("Samsung", "Galaxy S25", 89999, "Phantom Black");
        System.out.println("=== Mobile Details ===");
        System.out.println(mobile.getBrand());
        System.out.println(mobile.getModel());
        System.out.println(mobile.getPrice());
        System.out.println(mobile.getColor());

        Battery battery = new Battery(5000, "Li-Ion", "Samsung SDI");
        mobile.setBattery(battery);

        Battery mobBattery = mobile.getBattery();
        System.out.println("=== Battery Details ===");
        System.out.println(mobBattery.getCapacity());
        System.out.println(mobBattery.getType());
        System.out.println(mobBattery.getManufacturer());
    }
}