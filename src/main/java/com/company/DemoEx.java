package com.company;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class DemoEx {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction t = s.beginTransaction();
		
		Student s1 = new Student();
		s1.setCity("Mumbai");
		s1.setId(156);
		s1.setName("Montu");
		
		Certificate c1 = new Certificate("Android","2 months");
		s1.setCerti(c1);
		
		Student s2 = new Student();
		s2.setCity("Delhi");
		s2.setId(159);
		s2.setName("Sudip");
		
		Certificate c2 = new Certificate("Java","4 months");
		s2.setCerti(c2);
		
		s.save(s1);
		s.save(s2);
		
		t.commit();
		s.close();
		factory.close();

	}

}
