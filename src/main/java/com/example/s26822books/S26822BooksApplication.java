package com.example.s26822books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class S26822BooksApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(S26822BooksApplication.class, args);
		BookRepository bookRepository=context.getBean(BookRepository.class);
		AuthorRepository authorRepository=context.getBean(AuthorRepository.class);
		PublisherRepository publisherRepository=context.getBean(PublisherRepository.class);
	}

}
