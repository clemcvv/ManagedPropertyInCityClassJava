package packageCity;

abstract class  Property {
	
	/* ATTRIBUTES */
	private int valueEuro;
	private int costServicingMonthly;
	private static int nbCopy = 0;
	
	
	/* CONSTRUCTORS */
	public Property() {
		this.valueEuro = 0;
		this.costServicingMonthly = 0;
		nbCopy += 1;
	}
	
	public Property(int valueEuro, int costServicingMonthly) {
		this.valueEuro = valueEuro;
		this.costServicingMonthly = costServicingMonthly;
		nbCopy += 1;
	}
	
	/* GETTERS */
	public int getValueEuro() {
		return this.valueEuro;
	}
	
	public int getCostServicingMonthly() {
		return this.costServicingMonthly;
	}
	
	public int getNbCopy() {
		return nbCopy;
	}
	
	/* SETTERS */
	public void setValueEuro(int valueEuro) {
		this.valueEuro = valueEuro;
	}
	
	public void setCostServicingMonthly(int costServicingMonthly) {
		this.costServicingMonthly = costServicingMonthly;
	}
	
	
	/* toString */
	public String getBaseInfo() {
		return "It costs " + getValueEuro() + " euros and the monthly servicing cost is " + getCostServicingMonthly() + " euros.";
	}
	
	
	
}
