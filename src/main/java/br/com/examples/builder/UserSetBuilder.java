package br.com.examples.builder;

import java.util.HashSet;
import java.util.Set;

import br.com.examples.model.User;

public final class UserSetBuilder {

	private Set<User> users;
	
	private UserSetBuilder() {
		this.users = new HashSet<>();
	}
	
	public static UserSetBuilder builder() {
		return new UserSetBuilder();
	}
	
	public Set<User> createUsersSet() {
		
		User firstUser = new User("Carlos", 100);
		User secondUser = new User("Maria", 20);
		User thirdUser = new User("Jose", 20);
		
		users.add(firstUser);
		users.add(secondUser);
		users.add(thirdUser);
		
		return users;
	}
	
}
