package com.company.controller;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.company.model.Student;

public class MyProgram {

	public static void main(String[] args) {

           SessionFactory factory = new Configuration().configure().buildSessionFactory();
           
           Session s = factory.openSession();
           Transaction t = s.beginTransaction();
          
           /*
           Student s1 = new Student(1, "Rajesh", "Java");
           Student s2 = new Student(2, "Ramesh", "C++");
           Student s3 = new Student(3, "Suresh", "Sql");
           
           s.save(s1);
           s.save(s2);
           s.save(s3);
          */
           
           Student stu1 = s.get(Student.class, 1);
           Student stu2 = s.get(Student.class, 2);
           Student stu3 = s.get(Student.class, 3);
           
           System.out.println(stu1.getSno());
           System.out.println(stu1.getName());
           System.out.println(stu1.getSub());
           System.out.println("******************");
           
           System.out.println(stu2.getSno());
           System.out.println(stu2.getName());
           System.out.println(stu2.getSub());
           System.out.println("******************");
           
           System.out.println(stu3.getSno());
           System.out.println(stu3.getName());
           System.out.println(stu3.getSub());
           System.out.println("******************");
           
           //hql query to fetch the data
           // hql is just like sql and it is database independent
           System.out.println("2nd approach");
           
           Query ql = s.createQuery("from Student");
           List<Student> ls = ql.list();
           
           for(Student item : ls)
           {
        	   System.out.println(item.getSno());
               System.out.println(item.getName());
               System.out.println(item.getSub());
               System.out.println("******************");
           }
           
           //3rd approach
           Criteria c = s.createCriteria(Student.class);
           c.add(Restrictions.ge("sno", 2));
           List<Student> lsCri = c.list();
           
           for(Student item : lsCri)
           {
        	   System.out.println(item.getSno());
               System.out.println(item.getName());
               System.out.println(item.getSub());
               System.out.println("******************");
           }
           
           t.commit();
           s.close();
           factory.close();
	}

}
