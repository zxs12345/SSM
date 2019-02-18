package com.zxs.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.zxs.entity.Employee;



public interface empOneService  extends IService<Employee>{
	Employee getAllEmp();
}
