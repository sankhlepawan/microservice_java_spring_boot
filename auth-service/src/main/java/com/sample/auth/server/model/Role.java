package com.sample.auth.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;


@NamedQueries({
	@NamedQuery(name="findAllRoles",query="select role from Role role"),
	@NamedQuery(name="findByRoleName",query="select r from Role r where role=:roleName"),
})



@Entity
@Table(name="role")
public class Role {


	@Column(name="role_id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Column(name="name")
	private String name;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}





}