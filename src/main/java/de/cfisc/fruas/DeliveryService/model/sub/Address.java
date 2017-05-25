package de.cfisc.fruas.DeliveryService.model.sub;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Address {

	private String city;
	private String postCode;
	private String street;
	private int houseNumber;
	
	public Address() {
		
	}
	
	public Address(String city, String postCode, String street, int houseNumber) {		
		this.city = city;
		this.postCode = postCode;
		this.street = street;
		this.houseNumber = houseNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	
	
	
}
