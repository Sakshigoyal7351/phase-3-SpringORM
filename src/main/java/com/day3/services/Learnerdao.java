package com.day3.services;

import java.util.List;

import com.day3.entity.Learner;

public interface Learnerdao {

	public int insert(Learner learner);// add
	
	
	public void updateLearner(Learner learner); //update
	
	public void deleteLearner(int learnerId); // delete
	
	public Learner getLearner(int learnerId); // get single data
	
	public List<Learner> getAllLearners(); // get all data
	
	
}
