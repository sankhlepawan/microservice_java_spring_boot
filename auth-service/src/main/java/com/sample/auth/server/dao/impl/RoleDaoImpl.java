package com.sample.auth.server.dao.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.auth.server.dao.IRoleDao;
import com.sample.auth.server.model.Role;
import com.sample.auth.server.repo.IRoleRepository;

@Repository
public class RoleDaoImpl extends GenericDaoImpl<Role> implements IRoleDao{

	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	IRoleRepository repo;
	
	
	@Override
	public Role findById(Long id) {
		log.info("inside @class roleDaoImpl entry..");
		try{
			return repo.findById(id).get();
		}catch(Exception e){
			log.info("Exception inside @class roleDaoImpl {}..", e.getMessage());
			e.printStackTrace();
		}
		log.error("inside @class roleDaoImpl role with id {} not found return null..",id);
		return null;
		
	}

	@Override
	public Role findByName(String name) {
		try{
			return repo.findByName(name);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Long count() {
		return repo.count();
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}

	@Override
	public Role save(Role entity) {
		return repo.save(entity);
	}

	@Override
	public List<Role> findAll() {
		return repo.findAll();
	}

	
	
	
	
	
	
	
}
