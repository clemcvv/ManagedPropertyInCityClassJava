package packageCity;

public class TestProperty {
    public static void main(String[] args) {
        // Test default constructor
        Property property1 = new Property() {};
        System.out.println("Property 1: " + property1.getBaseInfo());

        // Test parameterized constructor
        Property property2 = new Property(100000, 500) {};
        System.out.println("Property 2: " + property2.getBaseInfo());

        // Test setters
        property2.setValueEuro(150000);
        property2.setCostServicingMonthly(600);
        System.out.println("Updated Property 2: " + property2.getBaseInfo());

        // Test number of copies
        System.out.println("Number of Property copies: " + property1.getNbCopy());
    }
}
