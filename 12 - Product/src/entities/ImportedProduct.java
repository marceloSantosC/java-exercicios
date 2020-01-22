package entities;

public final class ImportedProduct extends Product{
	private Double customFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	public double totalValue() {
		return getPrice() + customFee;
	}
	@Override
	public String pricetag() {
		return String.format("%s $%.2f (Customs fee: %.2f)", getName(), totalValue(),customFee);
	}

}
