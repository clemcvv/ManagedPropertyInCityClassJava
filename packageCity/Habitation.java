package packageCity;

public class Habitation extends Property{
	
	/* ATTRIBUTES */
	private int groundSurface;
	private int nbPeopleHoused;
	
	/* CONSTRUCTORS */
	public Habitation() {
		super();
		this.groundSurface = 0;
		this.nbPeopleHoused = 0;
		setCostServicingMonthly(0);  
		setValueEuro(0);
	}
	
	public Habitation(int groundSurface, int nbPeopleHoused, int costServicingMonthly, int valueEuro) {
		super(valueEuro,costServicingMonthly);
		this.groundSurface = groundSurface;
		this.nbPeopleHoused = nbPeopleHoused;
	}
	
	/* GETTERS */
	public int getGroundSurface() {
		return this.groundSurface;
	}
	public int getNbPeopleHoused() {
		return this.nbPeopleHoused;
	}
	
	/* SETTERS */
	public void setGroundSurface(int groundSurface) {
		this.groundSurface = groundSurface;
	}
	public void setNbPeopleHoused(int nbPeopleHoused) {
		this.nbPeopleHoused = nbPeopleHoused;
	}
	
	/* toString */
	public String getInfo() {
		return "The habitation has " + getGroundSurface() + " square meters of surface and houses " + getNbPeopleHoused() + " people. " + getBaseInfo();
	}
	
	
}
