package com.klebermagno.iterator;

import java.util.Iterator;
import java.util.List;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class IteratorForNotJava8Example {

	public static void main(String[] args) {
		
		final List<User> usuarios = UserListBuilder.builder().createListUsers();
		
		Iterator<User> iterator = usuarios.iterator();
		
		while(iterator.hasNext()) {
			ExampleUtil.print(iterator.next());
		}
		
	}

}
