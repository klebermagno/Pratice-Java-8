package br.com.examples.set;

import java.util.Set;

import br.com.examples.builder.UserSetBuilder;
import br.com.examples.model.User;

public class SetForEachExample {

	public static void main(String[] args) {
		
		final Set<User> users = UserSetBuilder.builder().createUsersSet();
		users.forEach(System.out::println);
		
	}

}
