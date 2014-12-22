package repositories;

import models.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public abstract class LibraryBookRepository {

	@Autowired
	private RedisTemplate<String, Book> repository;	
	
	
	public LibraryBookRepository(RedisTemplate<String, Book> repository) {
		super();
		this.repository = repository;
	}

	public void add(String key, Book value) {
		repository.opsForValue().set(key, value);
	}
	
	public Book getValue(String key) {
		return repository.opsForValue().get(key);
	}
	
	public void delete(String key) {
		repository.opsForValue().getOperations().delete(key);
	}

	public void convertAndSend(String string, String string2) {
		repository.convertAndSend("available_books",new Book("fff","ddd"));
		
	}
}
