package com.zxs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.zxs.dao.EmployeeMapper;
import com.zxs.entity.Employee;
import com.zxs.service.empOneService;


@Service
public class empOneServiceImpl extends ServiceImpl<BaseMapper<Employee>, Employee>  implements empOneService{
@Autowired
EmployeeMapper employeeMapper;
	@Override
	public Employee getAllEmp() {
		// TODO Auto-generated method stub
		return employeeMapper.selectEmployee(1);
	}

}
