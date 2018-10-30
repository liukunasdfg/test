package com.lk.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.lk.entity.Register;
public interface RegisterMapper {

	@Select("select * from t_vipuser where id = 19")
	public List<Map<String, Object>> getRegister();
	
	public List<Register> queryLK();
}
