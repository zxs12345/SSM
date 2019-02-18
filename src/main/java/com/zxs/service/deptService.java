package com.zxs.service;

import java.util.List;

import com.zxs.entity.Department;
import com.zxs.entity.DepartmentExample;

public interface deptService {
	Department selectByPrimaryKey(Integer id);
	List<Department> selectByExample(DepartmentExample example);
}
