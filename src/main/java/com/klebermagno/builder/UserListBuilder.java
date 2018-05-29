package com.klebermagno.builder;

import java.util.ArrayList;
import java.util.List;

import com.klebermagno.model.User;

public final class UserListBuilder extends UsersBuilder {

	private List<User> users;
	
	private UserListBuilder() {
		this.users = new ArrayList<>();
	}
	
	public static UserListBuilder builder() {
		return new UserListBuilder();
	}
	
	public List<User> createListUsers() {

		users  = (List<User>) createUsers(users);
		
		return users;
	}



	public List<User> createNewListUsers(final List<User> newList) {
		users.addAll(newList);
		return users;
	}
}
