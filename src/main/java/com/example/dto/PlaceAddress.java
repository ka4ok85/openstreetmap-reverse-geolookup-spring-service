package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlaceAddress {

	@JsonProperty(value = "house_number")
    private String houseNumber;

	private String road;

	private String suburb;

	private String city;

	private String county;

	@JsonProperty(value = "state_district")
	private String stateDistrict;
    
	private String state;

	private String postcode;

	private String country;

	@JsonProperty(value = "country_code")
	private String countryCode;

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getStateDistrict() {
		return stateDistrict;
	}

	public void setStateDistrict(String stateDistrict) {
		this.stateDistrict = stateDistrict;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "PlaceAddress [houseNumber=" + houseNumber + ", road=" + road + ", suburb=" + suburb + ", city=" + city
				+ ", county=" + county + ", stateDistrict=" + stateDistrict + ", state=" + state + ", postcode="
				+ postcode + ", country=" + country + ", countryCode=" + countryCode + "]";
	}
    
}
