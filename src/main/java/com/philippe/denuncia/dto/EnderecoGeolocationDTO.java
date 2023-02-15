package com.philippe.denuncia.dto;

import java.util.List;

public class EnderecoGeolocationDTO {
	
	private InfoGeolocation info;
	private OptionsGeolocationDTO options;
	private List<ResultGeoLocationDTO> results;
	
	public EnderecoGeolocationDTO() {
		
	}

	public InfoGeolocation getInfo() {
		return info;
	}

	public void setInfo(InfoGeolocation info) {
		this.info = info;
	}

	public OptionsGeolocationDTO getOptions() {
		return options;
	}

	public void setOptions(OptionsGeolocationDTO options) {
		this.options = options;
	}

	public List<ResultGeoLocationDTO> getResults() {
		return results;
	}

	public void setResults(List<ResultGeoLocationDTO> results) {
		this.results = results;
	}
	
}
