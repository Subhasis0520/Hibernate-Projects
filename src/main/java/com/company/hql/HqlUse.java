package com.company.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.company.Student;

public class HqlUse {

	public static void main(String[] args) {
		SessionFactory fac = new Configuration().configure().buildSessionFactory();
		Session s = fac.openSession();
		Transaction t = s.beginTransaction();
		
		//Read the data
		
//		String query = "from Student";
//		String query = "from Student where city = 'Delhi'";
		
		/*
		String query = "from Student where city = :x";  //dynamic query
			q.setParameter("x", "Mumbai");
		*/
		
		String query = "from Student as s where s.city = :x and s.name = :n";
		Query q = s.createQuery(query);
		
		q.setParameter("x", "Mumbai");
		q.setParameter("n", "Montu");
		
		
		List<Student> list = q.list();
		
		for(Student student : list)
		{
			System.out.println(student.getName());
			System.out.println(student.getCity());
			System.out.println(student.getCerti().getCourse());
		}
		
		/*
		//delete the data
		
		Query q2 = s.createQuery("delete from Student where city=:x");
		q2.setParameter("x", "Delhi");
		int res = q2.executeUpdate();
		System.out.println("Deleted: ");
		System.out.println(res);
		*/
		
		/*
		// Update Query
		Query q2 = s.createQuery("update Student set city=:c where name =:n");
		q2.setParameter("c", "Kolkata");
		q2.setParameter("n", "Montu");
		int res = q2.executeUpdate();
		System.out.println(res+" updated sucessfully");
		System.out.println("Thank you for updation");
		*/
		
		
		t.commit();
		s.close();
		fac.close();
		

	}

}
