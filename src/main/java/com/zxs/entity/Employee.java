package com.zxs.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableName;





/*@Alias("emp"),主配置文件设置包扫描批量取别名时用，为了区别包下以及子包下同类名的解决，此注解给每个类赋予唯一别名*/
@TableName("tbl_employee")
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String lastName;
	private String email;
	private Integer age;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(Integer id, String lastName, String email, Integer age) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", age=" + age + ", dp=" 
				+ "]";
	}
	
	

}
