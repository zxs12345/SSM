package com.zxs.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxs.entity.Department;
import com.zxs.entity.DepartmentExample;
import com.zxs.service.deptService;
import com.zxs.service.empOneService;
import com.zxs.service.empTowService;


public class deptTest extends BaseTest {

@Autowired
 deptService ds;

//测试mbg的example使用，详查https://blog.csdn.net/fly_fly_fly_pig/article/details/81592432
	@Test
	public void testone() throws Exception {
		DepartmentExample example = new DepartmentExample();
		example.createCriteria().andDeptNameLike("%研%");
		//System.out.println(ds.selectByPrimaryKey(1));
		System.out.println(ds.selectByExample(example));
	}
	@Test
	public void testo() throws Exception {
		
		System.out.println(ds.selectByPrimaryKey(1));
	}
	//分页插件测试
	@Test
	public void tesph() throws Exception {
		
		//获取第1页，10条内容，默认查询总数count
		PageHelper.startPage(2, 3);
		//紧跟着的第一个select方法会被分页
		 List<Department> list = ds.selectByExample(null);	
		PageInfo page=new PageInfo(list);
		System.out.println(page);
		
	}
	
}
