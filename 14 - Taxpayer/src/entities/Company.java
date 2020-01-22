package entities;

public class Company extends Taxpayer {
	private int numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, int numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double tax;
		if(numberOfEmployees > 10) {
			tax = getAnnualIncome() * 0.14; 
		}
		else {
			tax = getAnnualIncome() * 0.16;
		}
		return tax;
	}

	@Override
	public String toString() {
		return String.format("%s: $%.2f", getName(),tax());
	}
	
	
}
