package com.company.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
   
	@Id
	private int projectId;
	@Column(name = "Project_Name")
	private String projectName;
	
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee;

	public Project() {
		super();
	}

	public Project(int projectId, String projectName, List<Employee> employee) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employee = employee;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
