package com.zazu.dao;

import com.zazu.model.Person;

public interface PersonDao {
	
	public void insertPerson(Person person);
	
	public Person getPersonById(String id);

	public int getPersonCount();

}
