package com.ohmami.service.entities;

public class Passenger extends User implements GlobalUser {

	private final boolean driver = false;

	public boolean isDriver() {
		return driver;
	}
	
}
