package com.example.springh2inmemory110919.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.springh2inmemory110919.model.Author;
import com.example.springh2inmemory110919.model.Book;
import com.example.springh2inmemory110919.model.Publisher;
import com.example.springh2inmemory110919.repository.AuthorRepository;
import com.example.springh2inmemory110919.repository.BookRepository;
import com.example.springh2inmemory110919.repository.PublisherRepository;

@Component
public class DevJpaBootStrap implements ApplicationListener<ContextRefreshedEvent>{

	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	private AuthorRepository authorRepository;

	public DevJpaBootStrap(BookRepository bookRepository, PublisherRepository publisherRepository,
			AuthorRepository authorRepository) {
		super();
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
		this.authorRepository = authorRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	
	private void init() {
		Publisher publisher = new Publisher();
		publisher.setName("foo");
		publisher.setAddress("12th Street, LA");
		publisherRepository.save(publisher);
		
		// Eric
				Author eric = new Author("Eric", "Evans");
				Author anuj = new Author("Anuj","Singh");
				
				Book ddd = new Book("Domain Driven Design", "1234", publisher);
				Book dd1 = new Book("Harry Potter", "3214", publisher);
				
				eric.getBooks().add(ddd);
				eric.getBooks().add(dd1);
				ddd.getAuthors().add(eric);
				dd1.getAuthors().add(eric);
				dd1.getAuthors().add(anuj);

				authorRepository.save(eric);
				bookRepository.save(ddd);
				authorRepository.save(anuj);
				bookRepository.save(dd1);

				// Rod
				Author rod = new Author("Rod", "Johnson");
				Book noEJB = new Book("J2EE Development without EJB", "23444", publisher);
				rod.getBooks().add(noEJB);
				noEJB.getAuthors().add(rod);

				authorRepository.save(rod);
				bookRepository.save(noEJB);
	}
}
