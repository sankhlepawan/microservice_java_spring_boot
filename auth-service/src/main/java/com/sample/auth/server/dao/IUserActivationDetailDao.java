package com.sample.auth.server.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.auth.server.model.UserActivationDetail;


@Repository
@Transactional(readOnly = true)
public interface IUserActivationDetailDao extends IGenericDao<UserActivationDetail> {

	UserActivationDetail findByToken(String token);
	UserActivationDetail findByUserId(Long userId);
}
