package packageCity;

public class TestHabitation {
    public static void main(String[] args) {
        // Test default constructor
        Habitation habitation1 = new Habitation();
        System.out.println("Habitation 1: " + habitation1.getInfo());

        // Test parameterized constructor
        Habitation habitation2 = new Habitation(100, 4, 300, 200000);
        System.out.println("Habitation 2: " + habitation2.getInfo());

        // Test setters
        habitation2.setGroundSurface(120);
        habitation2.setNbPeopleHoused(5);
        System.out.println("Updated Habitation 2: " + habitation2.getInfo());

        // Test number of copies
        System.out.println("Number of Habitation copies: " + habitation2.getNbCopy());
    }
}
