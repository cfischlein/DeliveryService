package de.cfisc.fruas.DeliveryService.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Restaurant {

	private int id;
	private String name;
	private String telephone;
	private String email;
	private String address;
	private Map<Integer, MenuItem> menuItems = new HashMap<>();

	public Restaurant() {

	}

	public Restaurant(int id, String name, String telephone, String email, String address) {
		this.id = id;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	@XmlTransient
	public Map<Integer, MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(Map<Integer, MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

}
