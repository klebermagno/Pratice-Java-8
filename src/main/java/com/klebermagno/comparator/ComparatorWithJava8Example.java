package com.klebermagno.comparator;

import java.util.List;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class ComparatorWithJava8Example {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		
		users.forEach(user -> ExampleUtil.print(user));
		users.sort((user, otherUser) -> user.getName().compareTo(otherUser.getName()));
		
		ExampleUtil.printBlankLine();
		users.forEach(user -> ExampleUtil.print(user));
	}

}
