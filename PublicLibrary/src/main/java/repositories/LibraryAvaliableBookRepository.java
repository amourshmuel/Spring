package repositories;

import org.springframework.data.redis.core.RedisTemplate;

import models.Book;
import models.LibarayBookState;

public class LibraryAvaliableBookRepository extends LibraryBookRepository {

	public LibraryAvaliableBookRepository(RedisTemplate<String, Book> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	private final String RENTED_KEY=LibarayBookState.Rented.toString();
	
	public void add(String key, Book value) {
		super.add(RENTED_KEY+":"+key, value);
	}
	
	public Book getValue(String key) {
		return super.getValue(RENTED_KEY+":"+key);
	}
	
	public void delete(String key) {
		super.delete(RENTED_KEY+":"+key);
	}
	
	public void convertAndSend() {
		super.convertAndSend("chat", "Hello from Redis!");
	}
}
