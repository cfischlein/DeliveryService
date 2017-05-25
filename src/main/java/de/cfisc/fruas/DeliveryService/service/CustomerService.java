package de.cfisc.fruas.DeliveryService.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import de.cfisc.fruas.DeliveryService.database.DatabaseClass;
import de.cfisc.fruas.DeliveryService.exception.DataNotFoundException;
import de.cfisc.fruas.DeliveryService.model.Customer;
import de.cfisc.fruas.DeliveryService.model.sub.Address;

public class CustomerService {

private Map<Integer, Customer> customers = DatabaseClass.getCustomers();
	
	public CustomerService() {
		customers.put(1, new Customer(1, "Bruce", "Wayne", "bw@bat.com", "ih8joker", new Address("GothamCity", "1234", "BatcaveSt.", 1)));
		customers.put(2, new Customer(2, "Peter", "Parker", "pp@spider.net", "i<3mj", new Address("New York", "1234", "ForestHills", 12)));
	}
	
	public List<Customer> getAllCustomers() {
		return new ArrayList<Customer>(customers.values());
	}
	
	public Customer getCustomer(int id) {
		Customer customer =  customers.get(id);
		if(customer == null) {
			throw new DataNotFoundException("Customer with id " + id + " not found.");		
		}
		return customer;
	}
	
	public Customer addCustomer(Customer customer) {
		customer.setId(customers.size()+1);
		customers.put(customer.getId(), customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		if(customer.getId() <= 0) {
			return null;
		}
		customers.put(customer.getId(), customer);
		return customer;
	}
	
	public Customer removeCustomer(int id) {
		return customers.remove(id);		
	}
	
}
