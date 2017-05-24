package de.cfisc.fruas.DeliveryService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.cfisc.fruas.DeliveryService.database.DatabaseClass;
import de.cfisc.fruas.DeliveryService.model.Restaurant;

public class RestaurantService {

	private Map<Integer, Restaurant> restaurants = DatabaseClass.getRestaurants();
	
	public RestaurantService() {
		restaurants.put(1, new Restaurant(1, "Tony's Pizza Place", "123-CallTony", "pizza@tony.com", "Pizza Street, 123 Pizza Town"));
		restaurants.put(2, new Restaurant(2, "Bob's Burger Bar", "321-CallBob", "burger@bob.com", "Burger Street, 321 Burger Town"));
	}
	
	public List<Restaurant> getAllRestaurants() {
		return new ArrayList<Restaurant>(restaurants.values());
	}
	
	public Restaurant getRestaurant(int id) {
		return restaurants.get(id);
	}
	
	public Restaurant addRestaurant(Restaurant restaurant) {
		restaurant.setId(restaurants.size()+1);
		restaurants.put(restaurant.getId(), restaurant);
		return restaurant;
	}
	
	public Restaurant updateRestaurant(Restaurant restaurant) {
		if(restaurant.getId() <= 0) {
			return null;
		}
		restaurants.put(restaurant.getId(), restaurant);
		return restaurant;
	}
	
	public Restaurant removeRestaurant(int id) {
		return restaurants.remove(id);		
	}
	
	
}
