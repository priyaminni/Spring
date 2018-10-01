package com.example.demo.controller;

import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonService ps;
	
	@RequestMapping("/all")
	public Hashtable<String, Person> getPersons(){
		return ps.getPersons();
	}
	
	@RequestMapping("{Id}")
	public Person getPerson(@PathVariable("Id") String Id) {
		return ps.getPerson(Id);
		
	}
	
}
