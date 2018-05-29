package br.com.examples.comparator;

import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ComparatorWithJava8Example {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		
		users.forEach(user -> ExampleUtil.print(user));
		users.sort((user, otherUser) -> user.getName().compareTo(otherUser.getName()));
		
		ExampleUtil.printBlankLine();
		users.forEach(user -> ExampleUtil.print(user));
	}

}
