package com.ohmami.service.interfaces;

import com.ohmami.service.entities.User;

public interface AuthenticateService {

	void login(User user);
	void register(User user, String password);
	
}
