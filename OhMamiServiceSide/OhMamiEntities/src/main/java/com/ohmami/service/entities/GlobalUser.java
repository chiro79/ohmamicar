package com.ohmami.service.entities;

public interface GlobalUser {
	
	String getFirstName();
	void setFirstName(String firstName);
	String getSurname();
	void setSurname(String surname);
	String getUserName();
	void setUserName(String userName);
	boolean isDriver();

}
