package com.klebermagno.iterator;

import java.util.Iterator;
import java.util.List;

import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class IteratorForRemainingExample {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		
		Iterator<User> iterator = users.iterator();
		iterator.forEachRemaining(System.out::println);
	}
	
}
