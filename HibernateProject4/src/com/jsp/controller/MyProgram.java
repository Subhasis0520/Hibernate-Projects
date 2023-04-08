package com.jsp.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.jsp.model.Employee;

public class MyProgram {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		/*
		Employee e1 = new Employee("steve jobs",15000);
		Employee e2 = new Employee("bill gates",20000);
		Employee e3 = new Employee("steve balmner",25000);
		Employee e4 = new Employee("satya nadella",22000);
		Employee e5 = new Employee("merissa",20000);
		
		session.save(e1);
		session.save(e3);
		session.save(e4);
		session.save(e2);
		session.save(e5);
		*/
		
		Employee e1 = session.get(Employee.class, 1);
		System.out.println(e1.getEname());
		Employee e2 = session.get(Employee.class, 2);
		System.out.println(e2.getEname());
		Employee e3 = session.get(Employee.class, 3);
		System.out.println(e3.getEname());
		Employee e4 = session.get(Employee.class, 4);
		System.out.println(e4.getEname());
		Employee e5 = session.get(Employee.class, 5);
		System.out.println(e5.getEname());
		
		
		System.out.println("2nd approch");
		Query q = session.createQuery("from Employee where esal >= :e");
		int check = 20000;
		q.setParameter("e", check);
		
		List<Employee> ls = q.list();
		
		for(Employee e : ls)
		{
			System.out.println(e.getEname());
			System.out.println(e.getEsal());
		}
		
		
		System.out.println("3rd approch");
		Criteria cr=session.createCriteria(Employee.class);
		Criterion r1 = Restrictions.ilike("ename", "s%");
		Criterion r2 = Restrictions.lt("esal",20000);
		LogicalExpression exp = Restrictions.and(r1,r2);
		
		cr.add(exp);
		List<Employee> lsEmp = cr.list();
		for(Employee e : lsEmp)
		{
			System.out.println(e.getEname());
			System.out.println(e.getEsal());
		}
		
		t.commit();
		session.close();
		factory.close(); 

	}

}
