public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int year, int numberOfDoors) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateTripCost(double miles) {
        return miles * 0.15 + 5.00;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car");
        System.out.println("Doors: " + numberOfDoors);
    }
}
