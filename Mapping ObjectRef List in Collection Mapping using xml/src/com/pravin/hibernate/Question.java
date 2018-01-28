package com.pravin.hibernate;

import java.util.List;

public class Question {
    private String qname;
    private int id;
    private List<Answer> answers;

    public String getQname() {
	return qname;
    }

    public void setQname(String qname) {
	this.qname = qname;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public List<Answer> getAnswers() {
	return answers;
    }

    public void setAnswers(List<Answer> answers) {
	this.answers = answers;
    }

}
