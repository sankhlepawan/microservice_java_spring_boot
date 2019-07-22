package com.design.creational.builder;

public class UserBuilder {

	final String firstName;
	final String lastName;
	private Integer id;
	private String email;
	
	public UserBuilder(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public UserBuilder id(Integer id) {
		this.id = id;
		return this;
	}
	
	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}
	
	public User build() {
		User u = new User(this);
		return u;
	}
}
