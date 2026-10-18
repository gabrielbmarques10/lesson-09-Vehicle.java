public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }

    public double calculateTripCost(double miles) {
        return miles * 0.20;
    }

    public void displayInfo() {
        System.out.println(year + " " + brand);
    }
}
