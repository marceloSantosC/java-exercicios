package entities;

public class Person extends Taxpayer {
	private Double healthSpending;

	public Person() {
		super();
	}

	public Person(String name, Double annualIncome, Double healthSpending) {
		super(name, annualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		double tax = 0.0;
		if(getAnnualIncome() < 20000) {
			tax = getAnnualIncome() * 0.15 - 0.5 * healthSpending;
		} 
		else{
			tax = getAnnualIncome() * 0.25 - 0.5 * healthSpending;
		}
		return tax;
	}
	@Override
	public String toString() {
		return String.format("%s: $%.2f", getName(),tax());
	}
	
	
	
}
