package com.philippe.denuncia.dto;

public class OptionsGeolocationDTO {
	
	private Integer maxResults;
	private String ignoreLatLngInput;
	
	public OptionsGeolocationDTO() {
		
	}

	public Integer getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getIgnoreLatLngInput() {
		return ignoreLatLngInput;
	}

	public void setIgnoreLatLngInput(String ignoreLatLngInput) {
		this.ignoreLatLngInput = ignoreLatLngInput;
	}
	
}
