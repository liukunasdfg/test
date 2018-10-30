package com.lk.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lk.entity.Register;
import com.lk.mapper.RegisterMapper;
import com.lk.service.RegisterService;
import java.util.Map;
@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterMapper registerMapper;

	@Override
	public List<Map<String, Object>> getRegister() {
		return registerMapper.getRegister();
	}

	@Override
	public List<Register> queryLK() {
		return registerMapper.queryLK();
	}
}
