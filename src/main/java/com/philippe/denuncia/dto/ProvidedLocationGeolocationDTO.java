package com.philippe.denuncia.dto;

public class ProvidedLocationGeolocationDTO {
	
	private String location;
	private LatLngGeoLocationDTO latLng;
	
	public ProvidedLocationGeolocationDTO() {
		
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LatLngGeoLocationDTO getLatLng() {
		return latLng;
	}

	public void setLatLng(LatLngGeoLocationDTO latLng) {
		this.latLng = latLng;
	}
	
}
