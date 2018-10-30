package com.lk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.lk.entity.Register;
import com.lk.service.RegisterService;
import java.util.Map;
@Controller
//前缀
public class testController {
	@Autowired
	private RegisterService registerService;
	
	@RequestMapping("/ceString")
	@ResponseBody
	public String ceString() {
		return "1111";
	}
	
	@RequestMapping("/homeJsp")
	public String homeJsp() {
		return "front/home.jsp";
	}
	
	@RequestMapping("/register")
	@ResponseBody
	public boolean register(Register register) {
		System.out.println(register.toString());
		return true;
	}
	
	@RequestMapping("/getRegister")
	@ResponseBody
	public List<Map<String, Object>> getRegister() {
		return registerService.getRegister();
	}
	
	@RequestMapping("/queryLK")
	@ResponseBody
	public List<Register> queryLK() {
		return registerService.queryLK();
	}
}
