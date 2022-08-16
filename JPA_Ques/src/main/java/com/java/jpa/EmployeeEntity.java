package com.java.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name="empDetails")
public class EmployeeEntity {
	
	@Id
	private int empNo;
	
	private String eName;
	private String designation;
	private double sal;
	
	
	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(int empNo, String eName, String designation, double sal) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.designation = designation;
		this.sal = sal;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
}
