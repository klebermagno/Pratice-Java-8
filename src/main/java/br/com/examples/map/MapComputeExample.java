package br.com.examples.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class MapComputeExample {

	public static void main(String[] args) {
		final List<User> users = UserListBuilder.builder().createListUsers();
		final Map<String, Integer> usersByName = users.stream().collect(Collectors.toMap(User::getName, (u) -> u.getPoints()));
		
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		ExampleUtil.printBlankLine();
		usersByName.compute("Carlos", (name, points) -> points + 2);
		usersByName.compute("Novo Usuário", (name, points) -> 200);
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
	}
	
}
