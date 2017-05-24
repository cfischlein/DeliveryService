package de.cfisc.fruas.DeliveryService.database;

import java.util.HashMap;
import java.util.Map;

import de.cfisc.fruas.DeliveryService.model.Restaurant;

public class DatabaseClass {

	private static Map<Integer, Restaurant> restaurants = new HashMap<>();
	
	public static Map<Integer, Restaurant> getRestaurants() {
		return restaurants;
	}
	
}
