package com.jsp.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.model.Employee;

public class MyProgram {
  public static void main(String[] args) {
	
	  SessionFactory factory = new Configuration().configure().buildSessionFactory();
	  
	  Session s = factory.openSession();
	  
	  Transaction t = s.beginTransaction();
	  /*
	   * 
	  Employee e1 = new Employee(1,"steven",10000,"developer");
	  Employee e2 = new Employee(2,"bill",20000,"developer");
	  Employee e3 = new Employee(3,"andy",30000,"hr");
	  Employee e4 = new Employee("Kamal",40000,".net Developer");
	
	  
	  s.save(e1);
	  s.save(e2);
	  s.save(e3);
	    
	  */
	 
	  /*
	  //read the data by using hibernate [only one row at a time]
	  Employee emp2 = s.get(Employee.class,2);
	  System.out.println(emp2.getEno());
	  System.out.println(emp2.getEname());
	  System.out.println(emp2.getEsal());
	  System.out.println(emp2.getEdesignation());
	  
	  */
	  
	  /*
	  // update the data in DB
	  Employee empUpdate = s.get(Employee.class, 1);
	  empUpdate.setEdesignation("Full Stack Developer");
	  s.update(empUpdate);
	  
	  */
	  Employee empDel = s.get(Employee.class, 4);
	  s.delete(empDel);
	  
	  t.commit();
	  s.close();
	  factory.close();
     }
  }
