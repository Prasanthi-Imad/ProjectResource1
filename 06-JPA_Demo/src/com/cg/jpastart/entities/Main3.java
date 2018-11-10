package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main3 {
public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = factory.createEntityManager();
	
	SeatInfo seatInfo = new SeatInfo(50,20,30);
	Trip trip = new Trip();
	
	trip.setFrom_city("Chennai");
	trip.setTo_city("Mumbai");
	trip.setInfo(seatInfo);
	em.getTransaction().begin();
	em.persist(trip);
	em.getTransaction().commit();
	em.close();
	factory.close();
}
}
