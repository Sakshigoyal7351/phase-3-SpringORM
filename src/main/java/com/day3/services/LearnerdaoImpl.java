package com.day3.services;


import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.day3.entity.Learner;

public class LearnerdaoImpl implements Learnerdao{

	
	private HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Learner learner) {
		 Integer i =(Integer) hibernateTemplate.save(learner);
		return i;
	}

	@Transactional
	public void updateLearner(Learner learner) {
		hibernateTemplate.update(learner);
	}

	@Transactional
	public void deleteLearner(int learnerId) {
		Learner l = hibernateTemplate.get(Learner.class, learnerId);
		hibernateTemplate.delete(l);
		
	}

	public Learner getLearner(int learnerId) {
		Learner learner = hibernateTemplate.get(Learner.class, learnerId);
		
		return learner;
	}

	public List<Learner> getAllLearners() {
		List<Learner> list = hibernateTemplate.loadAll(Learner.class);
		return list;
	}

	

	
	
	
	
}
