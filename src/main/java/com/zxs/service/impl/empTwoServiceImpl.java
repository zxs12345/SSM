package com.zxs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxs.dao.EmployeeMapper;
import com.zxs.entity.Employee;
import com.zxs.service.empOneService;
import com.zxs.service.empTowService;


@Service
public class empTwoServiceImpl extends TwoBaseServiceImpl  implements empTowService{
@Autowired
EmployeeMapper employeeMapper;
	@Override
	public Employee getAllEmp() {
		// TODO Auto-generated method stub
		return employeeMapper.selectEmployee(1);
	}

}
