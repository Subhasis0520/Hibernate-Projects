package com.compamy.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		/*
		//create Question
		Question q1 = new Question();
		q1.setQuestionId(1212);
		q1.setQuestion("What is java?");
		
		// creating object for answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(343);
		answer1.setAnswer("Java is a programming language");
		answer1.setQuestion(q1);
		
		Answer answer2 = new Answer();
		answer2.setAnswerId(353);
		answer2.setAnswer("Java is used to develop software");
		answer2.setQuestion(q1);
		
		Answer answer3 = new Answer();
		answer3.setAnswerId(363);
		answer3.setAnswer("Java has diff types of framework");
		answer3.setQuestion(q1);
		
		List <Answer> list = new ArrayList<Answer>();
		list.add(answer1);
		list.add(answer2);
		list.add(answer3);
		
		q1.setAnswer(list);
		
		session.save(q1);	
		session.save(answer1);
		session.save(answer2);
		session.save(answer3);
		*/
		
	      Query q = session.createQuery("from Question");
	       List<Question> qlist =q.list();
	       
	       for(Question i : qlist)
	       {
	    	   System.out.println(i.getQuestionId());
	    	   System.out.println(i.getQuestion());
	    	   System.out.println(i.getAnswer());
	       }

		
		t.commit();
		

		
		session.close();
		factory.close();
	}

}