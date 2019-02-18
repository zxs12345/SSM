package com.zxs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxs.dao.DepartmentMapper;
import com.zxs.datasource.DataSource;
import com.zxs.entity.Department;
import com.zxs.entity.DepartmentExample;
import com.zxs.service.deptService;
@Service
//@DataSource(value=DataSource.TWO) 1.可直接用自定义注解标注数据源 2.不加则有默认数据源one
public class deptServiceImpl  implements deptService {
@Autowired
DepartmentMapper departmentMapper;
	@Override
	public Department selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return departmentMapper.selectByPrimaryKey(1);
	}
	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return departmentMapper.selectByExample(example);
	}

}
