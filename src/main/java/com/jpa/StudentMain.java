package com.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpatest");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student s1 = new Student();
		s1.setsName("Allen");
		em.persist(s1);
		em.getTransaction().commit();
	}

}
