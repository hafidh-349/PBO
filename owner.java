public class Owner {
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
