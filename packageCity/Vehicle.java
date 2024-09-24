package packageCity;

public class Vehicle extends Property {
	
	/* ATTRIBUTES */
	private String carRegistration;
	private int nbSeat;
	
	/* CONSTRUCTORS */
	public Vehicle() {
		super();
		this.carRegistration = "";
		this.nbSeat = 0;
		setCostServicingMonthly(0);  
		setValueEuro(0);
	}
	
	public Vehicle(String carRegistration, int nbSeat, int costServicingMonthly, int valueEuro) {
		super(valueEuro, costServicingMonthly);
		this.carRegistration = carRegistration;
		this.nbSeat = nbSeat;
	}
	
	/* GETTERS */
	public String getCarRegistration() {
		return carRegistration;
	}

	public void setCarRegistration(String carRegistration) {
		this.carRegistration = carRegistration;
	}

	/* SETTERS */
	public int getNbSeat() {
		return nbSeat;
	}

	public void setNbSeat(int nbSeat) {
		this.nbSeat = nbSeat;
	}
	
	/* toString */
	public String getInfo() {
		return "The vehicle " + getCarRegistration() + " has " + getNbSeat() + " seats. " + getBaseInfo();
	}
	
}
