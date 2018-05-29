package br.com.examples.set;

import java.util.Iterator;
import java.util.Set;

import br.com.examples.builder.UserSetBuilder;
import br.com.examples.model.User;

public class SetOldForExample {

	public static void main(String[] args) {
		
		final Set<User> users = UserSetBuilder.builder().createUsersSet();
		
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n");
		for(User u : users) {
			System.out.println(u);
		}
	}

}
