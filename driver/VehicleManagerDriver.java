package driver;
import java.util.Scanner;
import model.*;

public class VehicleManagerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance (in kilometers):");
        double distance = scanner.nextDouble();

        double carFuelConsumption = calculateFuelConsumption(new Car(), distance);
        double motorcycleFuelConsumption = calculateFuelConsumption(new Motorcycle(), distance);
        double truckFuelConsumption = calculateFuelConsumption(new Truck(), distance);

        System.out.println("Fuel consumption for " + distance + " kilometers:");
        System.out.println("Car: " + carFuelConsumption + " liters");
        System.out.println("Motorcycle: " + motorcycleFuelConsumption + " liters");
        System.out.println("Truck: " + truckFuelConsumption + " liters");

        scanner.close();
    }

    private static double calculateFuelConsumption(Vehicle vehicle, double distance) {
        return vehicle.fuelConsumption() * distance;
    }    
}
