public class Motorcycle extends Vehicle {
    private int engineCapacity;

    // Constructor dengan overloading
    public Motorcycle() {
        super();
        this.engineCapacity = 0;
    }

    public Motorcycle(String brand, int year, int engineCapacity) {
        super(brand, year);
        this.engineCapacity = engineCapacity;
    }

    // Getter dan Setter (Encapsulation)
    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Overriding method start
    @Override
    public void start() {
        System.out.println(brand + " motorcycle with " + engineCapacity + "cc engine is starting.");
    }
}
