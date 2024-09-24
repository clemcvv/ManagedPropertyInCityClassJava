package packageCity;

public class City {
    /* ATTRIBUTES */
    private Property[] properties; 
    
    public City (Property[] properties) {
    	this.properties = properties;
    }
    
    public Property[] getProperties() {
    	return this.properties;
    }
    
    public String getInfo(int id) {
    	return getProperties()[id].getBaseInfo();
    }
    
    public int getNbVehicle() {
    	int counter = 0;
    	for(int i = 0; i<getProperties().length;i++) {
    		if (getProperties()[i] instanceof Vehicle) {
    			counter++;
    		}
    	}
    	return counter;
    }
    
    public int getNbPeopleHoused() {
    	int counter = 0;
    	for (int i = 0; i<getProperties().length;i++) {
    		if (getProperties()[i] instanceof Habitation) {
    			counter++;
    		}
    	}
    	return counter;
    }
    
    public int getMaintenanceCost() {
    	int cost = 0;
    	for (int i = 0; i<getProperties().length;i++) {
    		cost += getProperties()[i].getCostServicingMonthly();
    	}
    	return cost;
    }
    
    public int getMaintenanceCostVehicle() {
    	int cost = 0;
    	for (int i = 0; i<getProperties().length;i++) {
    		if (getProperties()[i] instanceof Vehicle) {
    			cost += getProperties()[i].getCostServicingMonthly();
    		}
    	}
    	return cost;
    }
    
}
