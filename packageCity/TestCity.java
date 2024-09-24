package packageCity;

public class TestCity {
    public static void main(String[] args) {
        // Create some properties
        Property[] properties = new Property[3];
        properties[0] = new Vehicle("CAR-001", 4, 150, 25000);
        properties[1] = new Habitation(80, 3, 250, 150000);
        properties[2] = new Vehicle("CAR-002", 5, 200, 30000);

        // Create a city
        City city = new City(properties);
        
        // Display info for each property
        for (int i = 0; i < city.getProperties().length; i++) {
            System.out.println("Property " + (i + 1) + ": " + city.getInfo(i));
        }

        // Get counts
        System.out.println("Number of vehicles: " + city.getNbVehicle());
        System.out.println("Number of habitable properties: " + city.getNbPeopleHoused());
        System.out.println("Total maintenance cost: " + city.getMaintenanceCost());
        System.out.println("Total vehicle maintenance cost: " + city.getMaintenanceCostVehicle());
    }
}
