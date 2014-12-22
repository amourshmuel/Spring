package models;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.BookAvailableNtification;

public class Reader implements BookAvailableNtification{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Reader.class);


	private String name;
	
	private String surname;

	public Reader(){}
	public Reader(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public void handleMessage(String message) {
		LOGGER.info("Book: " + message+ ", available at the liberary");
	}
	
}
