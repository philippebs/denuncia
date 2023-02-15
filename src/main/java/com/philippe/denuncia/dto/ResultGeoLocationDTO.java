package com.philippe.denuncia.dto;

import java.util.List;

public class ResultGeoLocationDTO {
	
	private ProvidedLocationGeolocationDTO providedLocation;
	private List<LocationGeolocationDTO> locations;
	
	public ResultGeoLocationDTO() {
		
	}

	public ProvidedLocationGeolocationDTO getProvidedLocation() {
		return providedLocation;
	}

	public void setProvidedLocation(ProvidedLocationGeolocationDTO providedLocation) {
		this.providedLocation = providedLocation;
	}

	public List<LocationGeolocationDTO> getLocations() {
		return locations;
	}

	public void setLocations(List<LocationGeolocationDTO> locations) {
		this.locations = locations;
	}
	
}
