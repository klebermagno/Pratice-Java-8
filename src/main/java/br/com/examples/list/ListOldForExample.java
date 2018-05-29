package br.com.examples.list;

import java.util.Iterator;
import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ListOldForExample {
	
	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();

		// Iterando com Iterator
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			ExampleUtil.print(iterator.next());
		}
		
		ExampleUtil.printBlankLine();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
		
		ExampleUtil.printBlankLine();
		for (Iterator<User> iterator2 = users.iterator(); iterator2.hasNext();) {
			ExampleUtil.print(iterator2.next());
		}

		ExampleUtil.printBlankLine();
		for (User user : users) {
			ExampleUtil.print(user);
		}
		
	}
	
}
