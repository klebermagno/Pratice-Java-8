package com.klebermagno.list;

import java.util.List;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class ListForEachExample {
	
	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		users.forEach(user -> ExampleUtil.print(user)); 
		users.forEach(System.out::println);
		
	}
	
}
