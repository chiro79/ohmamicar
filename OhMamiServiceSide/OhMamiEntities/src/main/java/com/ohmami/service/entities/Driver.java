package com.ohmami.service.entities;

public class Driver extends User implements GlobalUser {

	private final boolean driver = true;

	public boolean isDriver() {
		return driver;
	}

}
