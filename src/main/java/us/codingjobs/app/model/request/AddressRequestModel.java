package us.codingjobs.app.model.request;

import javax.validation.constraints.Pattern;

public class AddressRequestModel {

	private String city;
	private String state;
	@Pattern(regexp="^[0-9]{5}(?:-[0-9]{4})?$",message="Zipcode is not pass the validation")
	private String zipCode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return getCity()+"|"+getState()+"|"+getZipCode();
	}
	
	
}
