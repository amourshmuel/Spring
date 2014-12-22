package repositories;

import models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;


public class aaaaa {

	@Autowired
	public aaaaa(RedisTemplate<String, Book> repository) {
		this.repository = repository;
	}
	
	public aaaaa(){
		
	}
	@Autowired
	private RedisTemplate<String, Book> repository;	
}
