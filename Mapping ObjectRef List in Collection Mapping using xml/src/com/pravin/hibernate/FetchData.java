package com.pravin.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();

	Query query = session.createQuery("from Question");
	@SuppressWarnings("unchecked")
	List<Question> questionsList = query.list();
	questionsList.forEach(a -> {
	    System.out.println("Question :: " + a.getQname());
	    a.getAnswers()
		    .stream()
		    .forEach(s -> {
			System.out.println("Name :: " + s.getGivenAnswer());
			System.out.println("Post By :: " + s.getPostBy());
		    });
	});
    }
}
