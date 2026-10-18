public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, int year, boolean hasSidecar) {
        super(brand, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateTripCost(double miles) {
        double cost = miles * 0.08;
        if (hasSidecar) {
            cost += 3.00;
        }
        return cost;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Motorcycle");
        System.out.println("Sidecar: " + hasSidecar);
    }
}
