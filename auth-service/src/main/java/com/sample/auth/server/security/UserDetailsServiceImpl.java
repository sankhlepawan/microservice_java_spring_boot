package com.sample.auth.server.security;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sample.auth.server.dao.IUserDao;
import com.sample.auth.server.model.AuthUser;
import com.sample.auth.server.model.User;

@Service
public class UserDetailsServiceImpl implements UserDetailsService  {

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private IUserDao useDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.err.println("in load user...."+ username);
		       // hard coding the users. All passwords must be encoded.
				/*final List<AuthUser> users = Arrays.asList(
					new AuthUser(1, "omar", encoder.encode("12345"), "USER"),
					new AuthUser(2, "admin", encoder.encode("12345"), "ADMIN")
				);*/
				
				User user = useDao.findByUsername(username);
//				System.err.println("pwd========" + encoder.matches("admin", user.getPassword()));
				if(user != null && CollectionUtils.isNotEmpty(user.getRole())) {
					List<GrantedAuthority> grantedAuthorities = AuthorityUtils
		                	.commaSeparatedStringToAuthorityList("ROLE_" + user.getRole());
					return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
				}
				

				/*for(AuthUser appUser: users) {
					if(appUser.getUsername().equals(username)) {
						
						// Remember that Spring needs roles to be in this format: "ROLE_" + userRole (i.e. "ROLE_ADMIN")
						// So, we need to set it to that format, so we can verify and compare roles (i.e. hasRole("ADMIN")).
						List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				                	.commaSeparatedStringToAuthorityList("ROLE_" + appUser.getRole());
						
						// The "User" class is provided by Spring and represents a model class for user to be returned by UserDetailsService
						// And used by auth manager to verify and check user authentication.
						return new org.springframework.security.core.userdetails.User(appUser.getUsername(), appUser.getPassword(), grantedAuthorities);
					}
				}*/
				
				// If user not found. Throw this exception.
				throw new UsernameNotFoundException("Username: " + username + " not found");
			}
	
	

}

