package com.philippe.denuncia.dto;

import java.util.List;

public class InfoGeolocation {
	
	private Integer statuscode;
	private CopyrightGeolocation copyright;
	private List<String> messages;
	
    public InfoGeolocation() {
		
	}

	public Integer getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(Integer statuscode) {
		this.statuscode = statuscode;
	}

	public CopyrightGeolocation getCopyright() {
		return copyright;
	}

	public void setCopyright(CopyrightGeolocation copyright) {
		this.copyright = copyright;
	}

	public List<String> getMessages() {
		return messages;
	}

	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
    
}
