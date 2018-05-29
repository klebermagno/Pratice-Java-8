package br.com.examples.list;

import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ListForEachExample {
	
	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		users.forEach(user -> ExampleUtil.print(user)); 
		users.forEach(System.out::println);
		
	}
	
}
