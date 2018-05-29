package br.com.examples.list;

import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ListReplaceAllExample {
	
	public static void main(String[] args) {
		final List<User> users = UserListBuilder.builder().createListUsers();
		users.forEach(System.out::println);
		
		ExampleUtil.printBlankLine();
		
		users.replaceAll(u -> new User("Novo Usuario", 10));
		users.forEach(System.out::println);
		
	}
	
}
