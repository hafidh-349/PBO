public class Truck extends Vehicle {
    private int loadCapacity;
    private String ownerName;

    // Constructor dengan overloading
    public Truck() {
        super();
        this.loadCapacity = 0;
        this.ownerName = "Unknown";
    }

    public Truck(String brand, int year, String ownerName, int loadCapacity) {
        super(brand, year);
        this.loadCapacity = loadCapacity;
        this.ownerName = ownerName;
    }

    // Getter dan Setter (Encapsulation)
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Overriding method start
    @Override
    public void start() {
        System.out.println(brand + " truck with load capacity " + loadCapacity + " tons is starting.");
    }

    public void showOwnership() {
        System.out.println("This truck belongs to " + ownerName);
    }
}
