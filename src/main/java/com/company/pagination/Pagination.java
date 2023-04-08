package com.company.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.company.Student;

public class Pagination {
	public static void main(String[] args) {
		SessionFactory fac = new Configuration().configure().buildSessionFactory();
		Session s = fac.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("from Student");
		
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		List<Student> list = q.list();
		
		for(Student st: list)
		{
			System.out.println(st.getName());
		}
		
		t.commit();
		s.close();
		fac.close();
	}
	
	
}
