package com.company.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.company.Student;

public class SecondCacheMemory {

	public static void main(String[] args) {
		 
		System.out.println( "Start Project" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session s1 = factory.openSession();
        Student st1 = s1.get(Student.class,156);
        System.out.println(st1);
        s1.close();
        
        Session s2 = factory.openSession();
        Student st2 = s2.get(Student.class,156);
        System.out.println(st2);
        
        s2.close();
	}

}
