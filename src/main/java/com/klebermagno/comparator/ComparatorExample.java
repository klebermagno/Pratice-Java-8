package com.klebermagno.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

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
