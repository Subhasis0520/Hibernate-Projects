package com.company.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int sno;
	private String name;
	private String sub;
	
	
	public Student() {
		super();
	}
	public Student(int sno, String name, String sub) {
		super();
		this.sno = sno;
		this.name = name;
		this.sub = sub;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
}
