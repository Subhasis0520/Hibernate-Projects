package com.company.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	
	@ManyToMany
//	@JoinTable(name="emp_Pro")
	private List<Project> project;
	
 
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Employee(int empId, String empName, List<Project> project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.project = project;
	}


	public Employee() {
		super();
	}

	
}
