public class Car extends Vehicle {
    private String fuelType;

    // Constructor dengan overloading
    public Car() {
        super();
        this.fuelType = "Unknown";
    }

    public Car(String brand, int year, String fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    // Getter dan Setter (Encapsulation)
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Overriding method start
    @Override
    public void start() {
        System.out.println(brand + " car is starting with " + fuelType + " fuel.");
    }
}
