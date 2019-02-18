package com.zxs.dao;

import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.zxs.entity.Employee;

public interface EmployeeMapper extends BaseMapper<Employee>{
	//查询方法
public Employee selectEmployee(Integer id);



}
