package com.philippe.denuncia.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LocationGeolocationDTO {
	
	private String street;
	private String adminArea6;
	private String adminArea6Type;
	private String adminArea5;
	private String adminArea5Type;
	private String adminArea4;
	private String adminArea4Type;
	private String adminArea3;
	private String adminArea3Type;
	private String adminArea1;
	private String adminArea1Type;
	private String postalCode;
	private String geocodeQualityCode;
	private String geocodeQuality;
	private boolean dragPoint;
	private String sideOfStreet;
	private String linkId;
	private String unknownInput;
	private String type;
	private LatLngGeoLocationDTO latLng;
	private LatLngGeoLocationDTO displayLatLng;
	private String mapUrl;
	
	@JsonIgnore
	private String roadMetadata;
	
	public LocationGeolocationDTO() {
	
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAdminArea6() {
		return adminArea6;
	}

	public void setAdminArea6(String adminArea6) {
		this.adminArea6 = adminArea6;
	}

	public String getAdminArea6Type() {
		return adminArea6Type;
	}

	public void setAdminArea6Type(String adminArea6Type) {
		this.adminArea6Type = adminArea6Type;
	}

	public String getAdminArea5() {
		return adminArea5;
	}

	public void setAdminArea5(String adminArea5) {
		this.adminArea5 = adminArea5;
	}

	public String getAdminArea5Type() {
		return adminArea5Type;
	}

	public void setAdminArea5Type(String adminArea5Type) {
		this.adminArea5Type = adminArea5Type;
	}

	public String getAdminArea4() {
		return adminArea4;
	}

	public void setAdminArea4(String adminArea4) {
		this.adminArea4 = adminArea4;
	}

	public String getAdminArea4Type() {
		return adminArea4Type;
	}

	public void setAdminArea4Type(String adminArea4Type) {
		this.adminArea4Type = adminArea4Type;
	}

	public String getAdminArea3() {
		return adminArea3;
	}

	public void setAdminArea3(String adminArea3) {
		this.adminArea3 = adminArea3;
	}

	public String getAdminArea3Type() {
		return adminArea3Type;
	}

	public void setAdminArea3Type(String adminArea3Type) {
		this.adminArea3Type = adminArea3Type;
	}

	public String getAdminArea1() {
		return adminArea1;
	}

	public void setAdminArea1(String adminArea1) {
		this.adminArea1 = adminArea1;
	}

	public String getAdminArea1Type() {
		return adminArea1Type;
	}

	public void setAdminArea1Type(String adminArea1Type) {
		this.adminArea1Type = adminArea1Type;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getGeocodeQualityCode() {
		return geocodeQualityCode;
	}

	public void setGeocodeQualityCode(String geocodeQualityCode) {
		this.geocodeQualityCode = geocodeQualityCode;
	}

	public String getGeocodeQuality() {
		return geocodeQuality;
	}

	public void setGeocodeQuality(String geocodeQuality) {
		this.geocodeQuality = geocodeQuality;
	}

	public boolean isDragPoint() {
		return dragPoint;
	}

	public void setDragPoint(boolean dragPoint) {
		this.dragPoint = dragPoint;
	}

	public String getSideOfStreet() {
		return sideOfStreet;
	}

	public void setSideOfStreet(String sideOfStreet) {
		this.sideOfStreet = sideOfStreet;
	}

	public String getLinkId() {
		return linkId;
	}

	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}

	public String getUnknownInput() {
		return unknownInput;
	}

	public void setUnknownInput(String unknownInput) {
		this.unknownInput = unknownInput;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LatLngGeoLocationDTO getLatLng() {
		return latLng;
	}

	public void setLatLng(LatLngGeoLocationDTO latLng) {
		this.latLng = latLng;
	}

	public LatLngGeoLocationDTO getDisplayLatLng() {
		return displayLatLng;
	}

	public void setDisplayLatLng(LatLngGeoLocationDTO displayLatLng) {
		this.displayLatLng = displayLatLng;
	}

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public String getRoadMetadata() {
		return roadMetadata;
	}

	public void setRoadMetadata(String roadMetadata) {
		this.roadMetadata = roadMetadata;
	}
	
	
}
