package com.ohmami.service.interfaces;

import java.util.List;

import com.ohmami.service.entities.Journey;
import com.ohmami.service.entities.User;

public interface JourneyService {
	
	List<User> findPossibleMatches(User user, Journey journeyDetails);

}
