package entities;

public class OrderItem {
	private Product product;
	private Integer quantity;


	public OrderItem(Product product, Integer quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double subtotal() {
		return quantity * product.getPrice();
	}
	@Override
	public String toString() {
		return product.getName() + "," + subtotal();
				
	}
}
