package br.com.examples.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class MapMergeExample {

	public static void main(String[] args) {
		
		final List<User> user = UserListBuilder.builder().createListUsers();
		final Map<String, Integer> usersByName = user.stream().collect(Collectors.toMap(User::getName, (u) -> u.getPoints()));
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		ExampleUtil.printBlankLine();
		System.out.println(usersByName.merge("Carlos", 1, (userPoints, pointsAdded) -> userPoints + pointsAdded));
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		ExampleUtil.printBlankLine();
		System.out.println(usersByName.merge("Usuário Novo", 1, (userPoints, pointsAdded) -> userPoints + pointsAdded));
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		ExampleUtil.printBlankLine();
		System.out.println(usersByName.merge("Usuário Novo Null", 1, (userPoints, pointsAdded) -> null));
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
	}
	
}
