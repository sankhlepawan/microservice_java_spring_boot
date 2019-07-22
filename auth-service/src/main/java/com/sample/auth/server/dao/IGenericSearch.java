package com.sample.auth.server.dao;

import com.sample.common.util.model.SearchResponse;

public interface IGenericSearch<T>{
	
	
	SearchResponse search(String queryString, Integer page, Integer limit,String orderBy,String orderType);
    
	 

}
