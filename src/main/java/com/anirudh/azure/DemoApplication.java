package com.anirudh.azure;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	
	private List<Book> bookList = Arrays.asList(
			new Book(1,"My Book","Anirudh"),
			new Book(2,"My Book 2","Anirudh and DK")
			);
	
	@GetMapping("books")
	public List<Book> getBooks(){
		return bookList;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
