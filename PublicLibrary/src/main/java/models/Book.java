package models;

import java.util.UUID;

public class Book {
	
	private UUID bookId;
	
	private String title;
	
	private String summery;
	
	private Integer edition;
	
	private String author;
	
	public Book(){}
	
	public Book(String title, String summery, Integer edition,
			String author){
		
		this.author=author;
		this.edition=edition;
		this.summery=summery;
		this.title=title;
		this.bookId=UUID.randomUUID();
	}
	
	public Book(String title,String author){
	
		this(title,"",1,author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummery() {
		return summery;
	}

	public void setSummery(String summery) {
		this.summery = summery;
	}

	public Integer getEdition() {
		return edition;
	}

	public void setEdition(Integer edition) {
		this.edition = edition;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public UUID getBookId() {
		return bookId;
	}
	
	public void setBookId(UUID bookId) {
		this.bookId = bookId;
	}

}
