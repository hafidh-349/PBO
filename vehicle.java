// Kelas Induk 1
class Vehicle {
    protected String brand;
    protected int year;

    // Constructor dengan overloading
    public Vehicle() {
        this.brand = "Unknown";
        this.year = 0;
    }

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter dan Setter (Encapsulation)
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Polimorfisme dinamis (virtual)
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Kelas Induk 2
class Owner {
    protected String ownerName;

    // Constructor dengan overloading
    public Owner() {
        this.ownerName = "Unknown";
    }

    public Owner(String ownerName) {
        this.ownerName = ownerName;
    }

    // Getter dan Setter (Encapsulation)
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Method untuk menunjukkan kepemilikan kendaraan
    public void showOwnership() {
        System.out.println("This vehicle belongs to " + ownerName);
    }
}

// Kelas Anak 1 (Inheritance dari Vehicle)
class Car extends Vehicle {
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

// Kelas Anak 2 (Inheritance dari Vehicle)
class Motorcycle extends Vehicle {
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

// Kelas Anak 3 (Inheritance dari Vehicle dan Owner)
class Truck extends Vehicle implements Owner {
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

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    // Overriding method start
    @Override
    public void start() {
        System.out.println(brand + " truck with load capacity " + loadCapacity + " tons is starting.");
    }

    @Override
    public void showOwnership() {
        System.out.println("This truck belongs to " + ownerName);
    }
}

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Inisialisasi objek Car
        Car car = new Car("Toyota", 2022, "Petrol");
        car.start(); // Polimorfisme
        System.out.println(car.getBrand() + " car made in " + car.getYear() + ".");

        // Inisialisasi objek Motorcycle
        Motorcycle motorcycle = new Motorcycle("Honda", 2020, 150);
        motorcycle.start(); // Polimorfisme
        System.out.println(motorcycle.getBrand() + " motorcycle with " + motorcycle.getEngineCapacity() + "cc engine.");

        // Inisialisasi objek Truck
        Truck truck = new Truck("Volvo", 2019, "John", 10);
        truck.start(); // Polimorfisme
        truck.showOwnership(); // Method dari interface Owner
    }
}
