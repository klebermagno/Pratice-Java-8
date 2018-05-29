package com.klebermagno.list;

import java.util.List;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class ListReplaceAllExample {
	
	public static void main(String[] args) {
		final List<User> users = UserListBuilder.builder().createListUsers();
		users.forEach(System.out::println);
		
		ExampleUtil.printBlankLine();
		
		users.replaceAll(u -> new User("Novo Usuario", 10));
		users.forEach(System.out::println);
		
	}
	
}
