/*
 * IS-A Test:
 * A Car is a Vehicle, and a Motorcycle is a Vehicle.
 * Both inherit common vehicle properties and behavior.
 * Each subclass adds its own features and calculates trip costs differently.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 2022, 4);
        Vehicle motorcycle = new Motorcycle("Honda", 2023, false);
        double distance = 100.0;

        System.out.println("=== CAR ===");
        car.displayInfo();
        System.out.printf("Trip cost: $%.2f%n", car.calculateTripCost(distance));

        System.out.println();
        System.out.println("=== MOTORCYCLE ===");
        motorcycle.displayInfo();
        System.out.printf("Trip cost: $%.2f%n", motorcycle.calculateTripCost(distance));
    }
}
