package br.com.examples.list;

import java.util.Iterator;
import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ListRemoveIfExample {
	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		ExampleUtil.print(users);
		
		Iterator<User> usersIterator = users.iterator();
		
		while(usersIterator.hasNext()) {
			User user = usersIterator.next();
			if(user.getPoints() == 100) {
				ExampleUtil.printRemoved(user);
				usersIterator.remove();
			}
		}
		
		ExampleUtil.printBlankLine();
		final List<User> newUsers = UserListBuilder.builder().createListUsers();
		newUsers.removeIf(user -> user.getPoints() == 20);
		users.forEach(System.out::println);
	}
}
