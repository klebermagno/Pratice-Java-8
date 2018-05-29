package br.com.examples.iterator;

import java.util.Iterator;
import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class IteratorForNotJava8Example {

	public static void main(String[] args) {
		
		final List<User> usuarios = UserListBuilder.builder().createListUsers();
		
		Iterator<User> iterator = usuarios.iterator();
		
		while(iterator.hasNext()) {
			ExampleUtil.print(iterator.next());
		}
		
	}

}
