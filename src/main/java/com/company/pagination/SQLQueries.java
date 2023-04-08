package com.company.pagination;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLQueries {

	public static void main(String[] args) {
		SessionFactory fac = new Configuration().configure().buildSessionFactory();
		Session s = fac.openSession();
		Transaction t = s.beginTransaction();

		NativeQuery nq = s.createSQLQuery("select * from student_address");
		
		List<Object[]> list = nq.list();
		
		for(Object[] obj : list)
		{
			System.out.println(Arrays.toString(obj));
		}
		
		t.commit();
		s.close();
		fac.close();
	}

}
