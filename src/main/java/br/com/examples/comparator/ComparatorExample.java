package br.com.examples.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class ComparatorExample {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		
		Collections.sort(users, new Comparator<User>() {
			@Override
			public int compare(User user, User otherUser) {
				return user.getName().compareTo(otherUser.getName());
			}
		});
		
		for (User user : users) {
			ExampleUtil.print(user);
		}
		
		
	}

}
