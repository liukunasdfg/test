package com.lk.service;

import java.util.List;


import com.lk.entity.Register;
import java.util.Map;


public interface RegisterService {

	List<Map<String, Object>> getRegister();
	
	List<Register> queryLK();

}