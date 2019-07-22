package com.sample.auth.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.auth.server.model.User;

@Repository
@Transactional(readOnly = true)
public interface IUserRepository extends JpaRepository<User, Long> {
	
	User findByUsernameOrEmail(String username,String email);
	
	User findByUsername(String username);
	
	User findByEmail(String email);

}
