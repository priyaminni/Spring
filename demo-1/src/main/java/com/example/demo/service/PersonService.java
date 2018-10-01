package com.example.demo.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.example.demo.model.Person;

@Service
public class PersonService {
	Hashtable<String, Person> persons= new Hashtable<String, Person>();
	public PersonService() {
		Person p=new Person();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Priya");
		p.setLastName("Gundavarapu");
		persons.put("1", p);
		
		p=new Person();
		p.setId("2");
		p.setAge(22);
		p.setFirstName("Indira");
		p.setLastName("Gundavarapu");
		persons.put("2", p);
	}
	
	public Person getPerson(String Id) {
		if(persons.containsKey(Id))
			return persons.get(Id);
		else 
			return null;
	}
	public Hashtable<String, Person> getPersons(){
		return persons;
		
	}
}
