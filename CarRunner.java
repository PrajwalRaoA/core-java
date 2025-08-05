public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Swift");
        car1.setFuelType("Petrol");
        car1.setTransmission("Manual");
        car1.setPrice(600000);

        Car car2 = new Car();
        car2.setModel("Baleno");
        car2.setFuelType("Petrol");
        car2.setTransmission("Auto");
        car2.setPrice(700000);

        Car car3 = new Car();
        car3.setModel("Creta");
        car3.setFuelType("Diesel");
        car3.setTransmission("Manual");
        car3.setPrice(1100000);

        Car car4 = new Car();
        car4.setModel("Fortuner");
        car4.setFuelType("Diesel");
        car4.setTransmission("Auto");
        car4.setPrice(4500000);

        Car car5 = new Car();
        car5.setModel("Alto");
        car5.setFuelType("Petrol");
        car5.setTransmission("Manual");
        car5.setPrice(400000);

        Car car6 = new Car();
        car6.setModel("Thar");
        car6.setFuelType("Diesel");
        car6.setTransmission("Manual");
        car6.setPrice(1400000);

        Car car7 = new Car();
        car7.setModel("XUV 700");
        car7.setFuelType("Petrol");
        car7.setTransmission("Auto");
        car7.setPrice(2200000);

        Car car8 = new Car();
        car8.setModel("Kwid");
        car8.setFuelType("Petrol");
        car8.setTransmission("Manual");
        car8.setPrice(450000);

        Car car9 = new Car();
        car9.setModel("Venue");
        car9.setFuelType("Diesel");
        car9.setTransmission("Auto");
        car9.setPrice(1050000);

        Car car10 = new Car();
        car10.setModel("i20");
        car10.setFuelType("Petrol");
        car10.setTransmission("Manual");
        car10.setPrice(800000);

        printCar(car1, 1);
        printCar(car2, 2);
        printCar(car3, 3);
        printCar(car4, 4);
        printCar(car5, 5);
        printCar(car6, 6);
        printCar(car7, 7);
        printCar(car8, 8);
        printCar(car9, 9);
        printCar(car10, 10);
    }

    public static void printCar(Car car, int number) {
        System.out.println("\nCar " + number);
        System.out.println("Model: " + car.getModel());
        System.out.println("Fuel Type: " + car.getFuelType());
        System.out.println("Transmission: " + car.getTransmission());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Wheels: " + Car.wheels);
    }
}










// static block will be executed when class is loaded or static variable or static method id called
// static block will be executed only once
// in static block non static variable can be initialized
// static block is used to intialize static variable and load static method

// non-static will be executed when object created
// non-static block will be executed many times based on number of objects created
// non-static block we can initialize static variable
