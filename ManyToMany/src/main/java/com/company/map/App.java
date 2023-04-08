package com.company.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory fac = new Configuration().configure().buildSessionFactory();
        Session s = fac.openSession();
        Transaction t = s.beginTransaction();
        
        Employee emp1 = new Employee();
        emp1.setEmpId(101);
        emp1.setEmpName("Sudip");
        
        Employee emp2 = new Employee();
        emp2.setEmpId(202);
        emp2.setEmpName("Deba");
        
        Project p1 = new Project();
        p1.setProjectId(12345);
        p1.setProjectName("Library Management");
        
        Project p2 = new Project();
        p2.setProjectId(12346);
        p2.setProjectName("CHAT BOX");
        
        List<Employee> el = new ArrayList<Employee>();
        List<Project> pl = new ArrayList<Project>();
        
        el.add(emp1);
        el.add(emp2);
        
        pl.add(p1);
        pl.add(p2);
        
        emp1.setProject(pl);
        p2.setEmployee(el);
        
        s.save(emp1);
        s.save(emp2);
        s.save(p1);
        s.save(p2);
        
        t.commit();
        s.close();
        fac.close();
    }
}
