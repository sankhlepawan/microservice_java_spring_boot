package com.sample.auth.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.auth.server.model.UserActivationDetail;

public interface IUserActivationDetailRepository extends JpaRepository<UserActivationDetail, Long>{
	
	UserActivationDetail findByActivationTokenAndValidTrue(String token);
	UserActivationDetail findByUserId(Long userid);
}
