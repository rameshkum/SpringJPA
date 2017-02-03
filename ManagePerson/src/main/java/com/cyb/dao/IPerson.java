package com.cyb.dao;

import java.util.List;

import com.cyb.bean.Person;

public interface IPerson {
	public void addPersonJPA(Person person);
	public void deleteEmployee(int id);
	public List<Person> loadTable();
	public void updatePerson(Person person);
}
