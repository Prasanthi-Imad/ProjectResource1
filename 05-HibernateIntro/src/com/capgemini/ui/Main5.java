package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.business.Contact;

public class Main5 {
	public static void main(String[] args) {

		Contact contact1 = new Contact(1, "Prash", "9876543210");
		Contact contact2 = new Contact(2, "Prashu", "7654321098");
		Contact contact3 = new Contact(3, "Prasanthi", "8765432109");
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();

		/*em.getTransaction().begin();
		em.persist(contact1);
		em.persist(contact2);
		em.persist(contact3);
		em.getTransaction().commit();

		contact3.setPhoneNum("9578462130");
		em.merge(contact3);

		em.close();
		emf.close();
*/
		Contact contact4 = null;
		emf = Persistence.createEntityManagerFactory("JPA-PU");
		em = emf.createEntityManager();

		contact4 = em.find(Contact.class, 3);
		contact4.setPhoneNum("8456971230");
		em.merge(contact4);

		System.out.println(contact4.equals(contact3));
		em.close();
		emf.close();

	}
}