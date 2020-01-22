package entities;

public class OutsorcedEmployee extends Employee {
	private Double additionalCharge;

	public OutsorcedEmployee() {
		super();
	}

	public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	@Override
	public Double payment() {
		double bonus = additionalCharge * 1.1;
		double sum  = super.payment() + bonus;
		return sum;
	}
	@Override
	public final String toString() {
		return String.format("Name: %s%nPayment: R$%.2f%n", getName(),payment());
	}
	
}
