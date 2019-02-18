package com.zxs.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.zxs.dao.EmployeeMapper;
import com.zxs.entity.Book;
import com.zxs.entity.Employee;
import com.zxs.service.BookService;
import com.zxs.service.empOneService;
import com.zxs.service.empTowService;


public class EmpServiceImplTest extends BaseTest {

@Autowired
private empOneService empservice1;
@Autowired
private empTowService empservice2;
@Autowired
BookService bookService;
@Autowired
EmployeeMapper em;
//测试第一数据源mp
	@Test
	public void testone() throws Exception {
		System.out.println(empservice1.getAllEmp());
	}
	//测试第二数据源mp2
	@Test
	public void testtwo() throws Exception {
		System.out.println(empservice2.getAllEmp());
	}
	//测试plus插件
		@Test
		public void testplus() throws Exception {
		//System.out.println(em.deleteById(1));			
		System.out.println(empservice1.selectById(3));
		}
		
		//测试生成的book表
		@Test
		public void testbook() throws Exception {
			bookService.selectById(1001);
			
			//bookService.selectAll();
		}
}
