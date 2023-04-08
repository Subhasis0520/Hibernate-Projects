package com.compamy.map;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLUse {

	public static void main(String[] args) {
		SessionFactory fac = new Configuration().configure().buildSessionFactory();
		Session s = fac.openSession();
		Transaction t = s.beginTransaction();
		
		
		// join Query
		String query = "select q.questionId , q.question, a.answer from Question as q inner join q.answer as a";
		Query q = s.createQuery(query);
		List<Object[]> list = q.getResultList();
		
		for(Object[] i : list)
		{
			System.out.println(Arrays.toString(i));
		}

		t.commit();
		s.close();
		fac.close();
	}

}
