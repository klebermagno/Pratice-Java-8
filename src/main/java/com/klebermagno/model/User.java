package com.klebermagno.model;

import java.util.Objects;

public class User {

	private String name;
	private int points;
	
	public User(String nome, int pontos) {
		this.name = nome;
		this.points = pontos;
	}

	public String getName() {
		return name;
	}

	public int getPoints() {
		return points;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this, obj);
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Points: " + this.points;
	}
}
