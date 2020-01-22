package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private Date manufactureDate;
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufacturePrice() {
		return manufactureDate;
	}

	public void setManufacturePrice(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String pricetag() {
		return String.format("%s $%.2f " + "(Manufacture date: "+ dateFormat.format(manufactureDate) + ")", getName(), getPrice());
	}
}
