package com.cyb.dao;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.cyb.bean.Person;

public class PersonImplementaion implements IPerson {
	private static EntityManager em;
	
	public PersonImplementaion() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ManagePerson");
		em=emf.createEntityManager();
	}
	
	public void addPersonJPA(Person person) {
		
		em.getTransaction().begin();
		em.persist(person);
		em.getTransaction().commit();
		em.close();
	}

	 public void deleteEmployee(int id) {
	        em.getTransaction().begin( );
	        Person person = em.find( Person.class, id );
	      
	        
	        em.remove(person);
	        
	        em.getTransaction().commit();
	        em.close();      
	    }
	
	public List<Person> loadTable()
	{
		TypedQuery<Person> query =  em.createQuery("SELECT p FROM Person p", Person.class);
		List<Person> items = query.getResultList();
		return items;
	}
	
	public void updatePerson(Person person)
	{
		em.getTransaction().begin( );
        Person p = em.find( Person.class, person.getPId() );     
        p.setPName(person.getPName());
        p.setPCountry(person.getPCountry());;
        em.getTransaction( ).commit( );
        em.close();
		
	}
	
}
