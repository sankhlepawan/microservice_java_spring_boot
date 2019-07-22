package com.design.creational.builder;

public class User implements Cloneable{
  
	private String firstName;
	private String lastName;
	private Integer id;
	private String email;
	
	User(UserBuilder builder) {
		  this.firstName = builder.firstName;
		  this.lastName = builder.lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
	
	
	
	
	
}


