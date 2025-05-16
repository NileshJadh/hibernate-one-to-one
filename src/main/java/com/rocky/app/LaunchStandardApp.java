package com.rocky.app;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rocky.model.Answer;
import com.rocky.model.Question;

public class LaunchStandardApp {

	public static void main(String args[]) {
		
		Configuration config = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		boolean flag = true;
		
		 config = new Configuration();
		 config.configure();
		 
		 sessionFactory =config.buildSessionFactory();
		 
		 session = sessionFactory.openSession();
		 
		 Question q1 = new Question();
		 
		 q1.setId(1);
		 q1.setQuestion("What is Hibernate");
		 
		 Answer ans1 = new Answer();
		 ans1.setId(1);
		 ans1.setAnswer("Hibernate is an ORM Framework");
		 
		 q1.setAnswer(ans1);
		 ans1.setQuestion(q1);
		 
		 Question q2 = new Question();
		 q2.setId(2);
		 q2.setQuestion("What is JPA");
		 
		 Answer ans2 = new Answer();
		 ans2.setId(2);
		 ans2.setAnswer("is a specification in Java that defines how to manage relational data in applications using Java objects");
		 
		 q2.setAnswer(ans2);
		 ans2.setQuestion(q2);
//		 Question qa = session.get(Question.class, 1);
//		 System.out.println(qa);
		 try {
			 
			 transaction = session.beginTransaction();
			 session.persist(q1);
			 session.persist(q2);
			 session.persist(ans1);
			 session.persist(ans2);
			 flag = true;
		 }
		 catch(HibernateException e) {
			 e.printStackTrace();
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 
			 if(flag==true) {
				 transaction.commit();
			 }
			 else {
				 transaction.rollback();
			 }
			 
			 session.close();
			 sessionFactory.close();
		 }
		 
		 
		 
	}
}
