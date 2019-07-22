package com.sample.auth.server.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="user_activation_detail")

public class UserActivationDetail {

	private static final long serialVersionUID = 1L;


	@Id
	@Column(name="uad_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="user_id")
	private Long userId;
	
	
	@Column(name="activation_token")
	private String activationToken;
	
	@Column(name="token_expire_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date tokenExpireOn;
	
	@Column(name="used_on")
	@Temporal(TemporalType.TIMESTAMP)
	private Date usedOn;
	
	@Column(name="valid")
	private boolean valid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getActivationToken() {
		return activationToken;
	}

	public void setActivationToken(String activationToken) {
		this.activationToken = activationToken;
	}

	public Date getTokenExpireOn() {
		return tokenExpireOn;
	}

	public void setTokenExpireOn(Date tokenExpireOn) {
		this.tokenExpireOn = tokenExpireOn;
	}

	public Date getUsedOn() {
		return usedOn;
	}

	public void setUsedOn(Date usedOn) {
		this.usedOn = usedOn;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	

}
