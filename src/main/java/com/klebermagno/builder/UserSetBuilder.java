package com.klebermagno.builder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.klebermagno.model.User;

public final class UserSetBuilder extends UsersBuilder {

	private Set<User> users;
	
	private UserSetBuilder() {
		this.users = new HashSet<>();
	}
	
	public static UserSetBuilder builder() {
		return new UserSetBuilder();
	}
	
	public Set<User> createUsersSet() {

		users  = (Set<User>) createUsers(users);
		
		return users;
	}
	
}
