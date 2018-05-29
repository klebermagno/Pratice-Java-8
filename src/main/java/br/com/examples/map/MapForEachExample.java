package br.com.examples.map;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.examples.ExampleUtil;
import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class MapForEachExample {

	public static void main(String[] args) {
		
		final List<User> users = UserListBuilder.builder().createListUsers();
		final Map<String, Integer> map = users.stream().collect(Collectors.toMap(User::getName, (u) -> u.getPoints()));
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			ExampleUtil.printUser(entry.getKey(), entry.getValue());
		}
		
		ExampleUtil.printBlankLine();
		map.forEach((name, points) -> ExampleUtil.printUser(name, points));
	}

}
