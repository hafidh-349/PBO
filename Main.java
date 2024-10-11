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
        truck.showOwnership(); // Method dari kelas Truck
    }
}
