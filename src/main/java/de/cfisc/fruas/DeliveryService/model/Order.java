package de.cfisc.fruas.DeliveryService.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Order {

	private int id;
	private double price;
	private Map<Integer, MenuItem> menuItems = new HashMap<>();
	private int customerId;
	private int supplierId;
	private int restaurantId;
	private boolean completed;

	public Order() {

	}

	public Order(int id, double price, Map<Integer, MenuItem> menuItems, int customerId, int supplierId,  int restaurantId,
			boolean completed) {
		this.id = id;
		this.price = price;
		this.menuItems = menuItems;
		this.customerId = customerId;
		this.supplierId = supplierId;
		this.restaurantId = restaurantId;
		this.completed = completed;
	}	

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Map<Integer, MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(Map<Integer, MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
