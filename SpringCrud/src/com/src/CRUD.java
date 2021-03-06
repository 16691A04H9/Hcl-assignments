package com.src;
public class CRUD {
	private String driverclass;
	private String url;
	private String username;
	private String password;
	public String getDriverclass() {
		return driverclass;
	}
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CRUD(String driverclass, String url, String username, String password) {
		super();
		this.driverclass = driverclass;
		this.url = url;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "CRUD [driverclass=" + driverclass + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
}
