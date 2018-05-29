package com.klebermagno;

import java.util.List;

import com.klebermagno.model.User;

public final class ExampleUtil {
	
	private ExampleUtil() {
		
	}
	
	public static void print(List<?> list) {
		list.forEach(o -> System.out.println(o));
		printBlankLine();
	}
	
	public static void printBlankLine() {
		System.out.println("\n");
	}
	
	public static void print(final User user) {
		System.out.println(user);
	}
	
	public static void printRemoved(final User user) {
		System.out.println(user + " removed");
	}
	
	public static void printUser(final String name, final Integer points) {
		System.out.println("The user: " + name + " has " + points + " points.");
	}
}
