package com.jsp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee_Details")
public class Employee
{
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //to auto increment
	@Column(name="eid")                                  //customized column name
	@Id
	private int eno;
   
	private String ename;
    private int esal;
 
    
    
	public Employee(int eno, String ename, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public Employee(String ename, int esal) {
			super();
			this.ename = ename;
			this.esal = esal;
		}
	 
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

    
    
	
}
