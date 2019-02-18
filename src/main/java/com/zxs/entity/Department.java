package com.zxs.entity;

public class Department {
    private Integer id;

    private String deptName;

    private Integer empId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", empId=" + empId + "]";
	}
    
}