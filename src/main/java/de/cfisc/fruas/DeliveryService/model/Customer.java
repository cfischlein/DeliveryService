package de.cfisc.fruas.DeliveryService.model;

import javax.xml.bind.annotation.XmlRootElement;

import de.cfisc.fruas.DeliveryService.model.sub.Address;

@XmlRootElement
public class Customer {

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Address address;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String email, String password, Address address) {		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}
