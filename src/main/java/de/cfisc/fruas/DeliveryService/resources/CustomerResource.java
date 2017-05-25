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

import de.cfisc.fruas.DeliveryService.model.Customer;
import de.cfisc.fruas.DeliveryService.service.CustomerService;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {	
	
	CustomerService customerService = new CustomerService();
	
	@GET	
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}
	
	@GET
	@Path("/{customerId}")
	public Customer getCustomer(@PathParam("customerId") int id) {	
		return 	customerService.getCustomer(id);
	}
	
	@POST	
	//TODO return response everywhere else
	public Response addCustomer(Customer customer, @Context UriInfo uriInfo) {
		Customer newCustomer = customerService.addCustomer(customer);
		String newId = String.valueOf(newCustomer.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri)
				.entity(newCustomer)				
				.build();		
	}	
	
	@PUT
	@Path("/{customerId}")
	public Customer updateCustomer(@PathParam("customerId") int id, Customer customer) {
		customer.setId(id);
		return customerService.updateCustomer(customer);
	}
	
	@DELETE
	@Path("/{customerId}")
	public Customer deleteCustomer(@PathParam("customerId") int id) {
		return customerService.removeCustomer(id);
	}

	
	
}
