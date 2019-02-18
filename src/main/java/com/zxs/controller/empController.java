package com.zxs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zxs.entity.Employee;
import com.zxs.service.empOneService;




@Controller
public class empController {
	@Autowired
	private empOneService employeeMapper;
	@RequestMapping("/getemp")
	@ResponseBody
public Employee getemp() {
		System.out.println("精炼");
	return employeeMapper.getAllEmp();
}
	
	//页面跳转测试
	@RequestMapping("/list")
	public String tolist() {
		return "list";
	}
}
