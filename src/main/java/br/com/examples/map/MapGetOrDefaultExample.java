package br.com.examples.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.examples.builder.UserListBuilder;
import br.com.examples.model.User;

public class MapGetOrDefaultExample {

	public static void main(String[] args) {
		
		final List<User> usuarios = UserListBuilder.builder().createListUsers();
		final Map<String, Integer> usuariosPorNome = usuarios.stream().collect(Collectors.toMap(User::getName, (u) -> u.getPoints()));
		usuariosPorNome.forEach((nome, pontos) -> System.out.println("O usuário: " + nome + " possui " + pontos + " pontos."));
		
		System.out.println("\n");
		System.out.println("Pontuação de Carlos: " + usuariosPorNome.getOrDefault("Carlos", 0));
		System.out.println("Pontuação de Usuario Inexistente: " + usuariosPorNome.getOrDefault("Usuario Inexistente", 0));
	}
	
}
