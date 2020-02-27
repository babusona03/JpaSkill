package test.learn.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Integer houseNo;
	private String streetName;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
