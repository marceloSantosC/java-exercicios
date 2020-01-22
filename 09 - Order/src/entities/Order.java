package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();
	public Order(Date momment, OrderStatus status, Client client) {
		this.momment = momment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMomment() {
		return momment;
	}
	public void setMomment(Date momment) {
		this.momment = momment;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	public void addItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	public Double total() {
		double sum = 0;
		for(OrderItem price:orderItems) {
			sum += price.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nOrder Status: " + status + "\n");
		sb.append("Order momment: " + dateFormat.format(momment) + "\n");
		sb.append(client + "\n");
		sb.append("\nOrder Items: \n");
		for(OrderItem c: orderItems) {
			sb.append(c);
		}
		sb.append("nTotal: $" + total());
		return sb.toString();
	}

}
