abstract class Vehicle {

    // Abstract methods
    abstract void start();

    abstract void stop();
}


// Interface
interface FuelEfficiency {

    void calculateMileage();
}


// Car class extends Vehicle and implements FuelEfficiency
class Car extends Vehicle implements FuelEfficiency {

    // Implement start method
    public void start() {
        System.out.println("Car started using key ignition.");
    }

    // Implement stop method
    public void stop() {
        System.out.println("Car stopped safely.");
    }

    // Implement calculateMileage method
    public void calculateMileage() {
        System.out.println("Car Mileage: 15 km/l");
    }
}


// Bike class extends Vehicle and implements FuelEfficiency
class Bike extends Vehicle implements FuelEfficiency {

    // Implement start method
    public void start() {
        System.out.println("Bike started using self-start button.");
    }

    // Implement stop method
    public void stop() {
        System.out.println("Bike stopped safely.");
    }

    // Implement calculateMileage method
    public void calculateMileage() {
        System.out.println("Bike Mileage: 45 km/l");
    }
}


// Main class
public class VehicleManagementSystem {

    public static void main(String[] args) {


        // Creating Car object
        Car car = new Car();

        System.out.println("Car Details");
        System.out.println("----------------");

        car.start();
        car.stop();
        car.calculateMileage();


        System.out.println();


        // Creating Bike object
        Bike bike = new Bike();

        System.out.println("Bike Details");
        System.out.println("----------------");

        bike.start();
        bike.stop();
        bike.calculateMileage();
    }
}
