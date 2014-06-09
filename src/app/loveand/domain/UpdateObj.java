package app.loveand.domain;

import java.io.Serializable;

public class UpdateObj implements Serializable {

	private static final long serialVersionUID = 1L;
	private String title;
	private String message;
	private String url;
	public String getTitle() {
		return title; 
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
