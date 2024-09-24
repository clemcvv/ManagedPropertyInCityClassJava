package packageCity;

public class TestVehicle {
    public static void main(String[] args) {
        // Test default constructor
        Vehicle vehicle1 = new Vehicle();
        System.out.println("Vehicle 1: " + vehicle1.getInfo());

        // Test parameterized constructor
        Vehicle vehicle2 = new Vehicle("ABC-123", 5, 200, 30000);
        System.out.println("Vehicle 2: " + vehicle2.getInfo());

        // Test setters
        vehicle2.setCarRegistration("XYZ-789");
        vehicle2.setNbSeat(4);
        System.out.println("Updated Vehicle 2: " + vehicle2.getInfo());

        // Test number of copies
        System.out.println("Number of Vehicle copies: " + vehicle2.getNbCopy());
    }
}
