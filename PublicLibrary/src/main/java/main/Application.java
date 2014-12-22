package main;


import models.Book;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import repositories.LibraryBookRepository;


public class Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) throws InterruptedException {
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/application-context.xml");
		
		LibraryBookRepository repository =ctx.getBean(LibraryBookRepository.class);
		repository.convertAndSend("1", "2");
		repository.add("Hi", new Book("title", "author"));
		LOGGER.debug(repository.toString());
		((ConfigurableApplicationContext)ctx).close();
		System.exit(0);
	}

}
