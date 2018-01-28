package com.pravin.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();

	Answer answer1 = new Answer();
	answer1.setGivenAnswer("Mohan P");
	answer1.setPostBy("mohan");

	Answer answer2 = new Answer();
	answer2.setGivenAnswer("Rohan P");
	answer2.setPostBy("rohan");

	List<Answer> answerList1 = new ArrayList<>();
	answerList1.add(answer1);
	answerList1.add(answer2);

	Question question = new Question();
	question.setQname("What's your name?");
	question.setAnswers(answerList1);

	session.persist(question);
	transaction.commit();
	session.close();

	System.out.println("Success!");

    }
}
