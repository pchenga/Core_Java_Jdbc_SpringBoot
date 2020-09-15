package com.pc.java_advanced;

//Model class
//POJO (Plan Old Java Object)
public class Employee {
	Integer eid;
	String ename;
	String email;
	Long   phone;
	Double salary;
	
	public Employee(Integer eid, String ename, String email, Long phone, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	

}
