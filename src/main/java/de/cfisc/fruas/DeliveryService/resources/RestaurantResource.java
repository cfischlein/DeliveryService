package de.cfisc.fruas.DeliveryService.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import de.cfisc.fruas.DeliveryService.model.Restaurant;
import de.cfisc.fruas.DeliveryService.service.RestaurantService;

@Path("/restaurants")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestaurantResource {	
	
	RestaurantService restaurantService = new RestaurantService();
	
	@GET	
	public List<Restaurant> getAllRestaurants() {
		return restaurantService.getAllRestaurants();
	}
	
	@GET
	@Path("/{restaurantId}")
	public Restaurant addRestaurant(@PathParam("restaurantId") int id) {	
		return 	restaurantService.getRestaurant(id);
	}
	
	@POST	
	//TODO return response everywhere else
	public Response addRestaurant(Restaurant restaurant, @Context UriInfo uriInfo) {
		Restaurant newRestaurant = restaurantService.addRestaurant(restaurant);
		String newId = String.valueOf(newRestaurant.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)
				.entity(newRestaurant)				
				.build();		
	}	
	
	@PUT
	@Path("/{restaurantId}")
	public Restaurant updateRestaurant(@PathParam("restaurantId") int id, Restaurant restaurant) {
		restaurant.setId(id);
		return restaurantService.updateRestaurant(restaurant);
	}
	
	@DELETE
	@Path("/{restaurantId}")
	public Restaurant deleteRestaurant(@PathParam("restaurantId") int id) {
		return restaurantService.removeRestaurant(id);
	}
	
	@Path("/{restaurantId}/menuitems")
	public MenuItemResource getMenuItemResource() {
		return new MenuItemResource();
	}
	
	
	
	
}
