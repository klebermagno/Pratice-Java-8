package br.com.examples.iterator;

import java.util.Iterator;
import java.util.List;

import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class IteratorForRemainingExample {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		
		Iterator<User> iterator = users.iterator();
		iterator.forEachRemaining(System.out::println);
	}
	
}
