package br.com.examples.builder;

import java.util.ArrayList;
import java.util.List;

import br.com.examples.model.User;

public final class UserListBuilder {

	private List<User> users;
	
	private UserListBuilder() {
		this.users = new ArrayList<>();
	}
	
	public static UserListBuilder builder() {
		return new UserListBuilder();
	}
	
	public List<User> createListUsers() {
	
		User firstUser = new User("Carlos", 100);
		User secondUser = new User("Maria", 20);
		User thirdUser = new User("Jose", 20);
		
		users.add(firstUser);
		users.add(secondUser);
		users.add(thirdUser);
		
		return users;
	}
	
	public List<User> createNewListUsers(final List<User> newList) {
		users.addAll(newList);
		return users;
	}
}
