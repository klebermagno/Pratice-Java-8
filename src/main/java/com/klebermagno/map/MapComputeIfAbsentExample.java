package com.klebermagno.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.klebermagno.ExampleUtil;
import com.klebermagno.builder.UserListBuilder;
import com.klebermagno.model.User;

public class MapComputeIfAbsentExample {

	public static void main(String[] args) {
		final List<User> users = UserListBuilder.builder().createListUsers();
		final Map<String, Integer> usersByName = users.stream().collect(Collectors.toMap(User::getName, (u) -> u.getPoints()));
		
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		ExampleUtil.printBlankLine();
		System.out.println(usersByName.computeIfAbsent("Carlos", (points) -> 156));
		System.out.println(usersByName.computeIfAbsent("Novo Usuário", (points) -> 200));
		usersByName.forEach((name, points) -> ExampleUtil.printUser(name, points));
		
		
	}
	
}
