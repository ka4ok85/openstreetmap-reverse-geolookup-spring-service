package com.example.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaceContainer {

	private String lat;
	private String lon;
	
	private PlaceAddress address;

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public PlaceAddress getAddress() {
		return address;
	}

	public void setAddress(PlaceAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PlaceContainer [lat=" + lat + ", lon=" + lon + ", address=" + address + "]";
	}
	
}
