package repositories;

import org.springframework.data.redis.core.RedisTemplate;

import models.Book;
import models.LibarayBookState;

public class LibraryRentedBookRepository extends LibraryBookRepository {

	public LibraryRentedBookRepository(RedisTemplate<String, Book> repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	private final String AVAILABLE_KEY=LibarayBookState.Available.toString();
	
	public void add(String key, Book value) {
		super.add(AVAILABLE_KEY+":"+key, value);
	}
	
	public Book getValue(String key) {
		return super.getValue(AVAILABLE_KEY+":"+key);
	}
	
	public void delete(String key) {
		super.delete(AVAILABLE_KEY+":"+key);
	}
}
