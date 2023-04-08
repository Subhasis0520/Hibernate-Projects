package com.jsp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employee")
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //to auto increment
	@Column(name="eid")                                  //customized column name
    private int eno;
   
	private String ename;
    private int esal;
    private String edesignation;
    
    
	public Employee(int eno, String ename, int esal, String edesignation) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.edesignation = edesignation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 public Employee(String ename, int esal, String edesignation) {
			super();
			this.ename = ename;
			this.esal = esal;
			this.edesignation = edesignation;
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
	public String getEdesignation() {
		return edesignation;
	}
	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
    
    
	
}
