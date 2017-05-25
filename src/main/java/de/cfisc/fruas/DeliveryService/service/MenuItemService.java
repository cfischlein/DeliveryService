package de.cfisc.fruas.DeliveryService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import de.cfisc.fruas.DeliveryService.database.DatabaseClass;
import de.cfisc.fruas.DeliveryService.model.MenuItem;
import de.cfisc.fruas.DeliveryService.model.Restaurant;

public class MenuItemService {
	
	private Map<Integer, Restaurant> restaurants = DatabaseClass.getRestaurants();
	
	public MenuItemService() {
		restaurants.get(1).getMenuItems().put(1, new MenuItem(1, "Large Pizza", 5.5));
		restaurants.get(1).getMenuItems().put(2, new MenuItem(2, "Small Pizza", 4.4));
		restaurants.get(2).getMenuItems().put(1, new MenuItem(1, "Large Burger", 7.7));
		restaurants.get(2).getMenuItems().put(2, new MenuItem(2, "Small Burger", 6.6));
	}

	public List<MenuItem> getAllMenuItems(int restaurantId) {
		Map<Integer, MenuItem> menuItems = restaurants.get(restaurantId).getMenuItems();
		return new ArrayList<MenuItem>(menuItems.values());
	}
	
	public MenuItem getMenuItem(int restaurantId, int menuItemId) {
		Restaurant restaurant = restaurants.get(restaurantId);
		if(restaurant == null) {
			throw new WebApplicationException(Status.NOT_FOUND);
		}
		Map<Integer, MenuItem> menuItems = restaurants.get(restaurantId).getMenuItems();
		MenuItem menuItem =  menuItems.get(menuItemId);
		if(menuItem == null) {
			throw new NotFoundException();
		}
		return menuItem;
	}
	
	public MenuItem addMenuItem(int restaurantId, MenuItem menuItem) {
		Map<Integer, MenuItem> menuItems = restaurants.get(restaurantId).getMenuItems();
		menuItem.setId(menuItems.size()+1);
		menuItems.put(menuItem.getId(), menuItem);
		return menuItem;
	}
	
	public MenuItem updateMenuItem(int restaurantId, MenuItem menuItem) {
		Map<Integer, MenuItem> menuItems = restaurants.get(restaurantId).getMenuItems();
		if(menuItem.getId() <= 0) {
			return null;
		}
		menuItems.put(menuItem.getId(), menuItem);
		return menuItem;
	}
	
	public MenuItem deleteMenuItem(int restaurantId, int menuItemId) {
		Map<Integer, MenuItem> menuItems = restaurants.get(restaurantId).getMenuItems();
		return menuItems.remove(menuItemId);
	}
}
