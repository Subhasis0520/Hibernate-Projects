package com.company.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		// creating object for answer
		Answer answer1 = new Answer(343,"Java is a programming language");
		
		//create Question
		Question q1 = new Question(1212,"What is java?",answer1);
		
		// creating object for answer
		Answer answer2 = new Answer(344,"API to work with object in java");
		
		//create Question
		Question q2 = new Question(242,"What is collection?",answer2);
		
		session.save(q1);
		session.save(q2);
		session.save(answer1);
		session.save(answer2);
		t.commit();
		
		//fetch
		Question newQ = session.get(Question.class, 1212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		session.close();
		factory.close();
	}

}
