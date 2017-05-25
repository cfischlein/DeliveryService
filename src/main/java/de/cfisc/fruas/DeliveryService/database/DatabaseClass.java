package de.cfisc.fruas.DeliveryService.database;

import java.util.HashMap;
import java.util.Map;

import de.cfisc.fruas.DeliveryService.model.Customer;
import de.cfisc.fruas.DeliveryService.model.Restaurant;

public class DatabaseClass {

	private static Map<Integer, Restaurant> restaurants = new HashMap<>();
	private static Map<Integer, Customer> customers = new HashMap<>();

	public static Map<Integer, Restaurant> getRestaurants() {
		return restaurants;
	}

	public static Map<Integer, Customer> getCustomers() {
		return customers;
	}

}
