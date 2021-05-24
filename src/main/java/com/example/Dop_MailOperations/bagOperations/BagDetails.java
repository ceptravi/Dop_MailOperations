package com.example.Dop_MailOperations.bagOperations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BagDetails {

	@Id
	private String bag_barcode;
	private String user_id;
	private String set_id;
	private String origin_office_id;
	private String destination_office_id;
	private String transit_mode="ROAD";
	private Integer weight;
	
	
	public String getBag_barcode() {
		return bag_barcode;
	}
	public void setBag_barcode(String bag_barcode) {
		this.bag_barcode = bag_barcode;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getSet_id() {
		return set_id;
	}
	public void setSet_id(String set_id) {
		this.set_id = set_id;
	}
	public String getOrigin_office_id() {
		return origin_office_id;
	}
	public void setOrigin_office_id(String origin_office_id) {
		this.origin_office_id = origin_office_id;
	}
	public String getDestination_office_id() {
		return destination_office_id;
	}
	public void setDestination_office_id(String destination_office_id) {
		this.destination_office_id = destination_office_id;
	}
	public String getTransit_mode() {
		return transit_mode;
	}
	public void setTransit_mode(String transit_mode) {
		this.transit_mode = transit_mode;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public BagDetails(String bag_barcode, String user_id, String set_id, String origin_office_id,
			String destination_office_id, String transit_mode, Integer weight) {
		super();
		this.bag_barcode = bag_barcode;
		this.user_id = user_id;
		this.set_id = set_id;
		this.origin_office_id = origin_office_id;
		this.destination_office_id = destination_office_id;
		this.transit_mode = transit_mode;
		this.weight = weight;
	}
	
	
	public BagDetails() {
		super();
		
	}
	
	
	
}
