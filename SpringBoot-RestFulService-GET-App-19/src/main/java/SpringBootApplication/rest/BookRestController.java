package SpringBootApplication.rest;

import org.springframework.web.bind.annotation.GetMapping;

//import java.awt.print.Book;

import org.springframework.web.bind.annotation.RestController;

import SpringBootApplication.response.Book;

@RestController
public class BookRestController {
	@GetMapping("/book")
	public Book getBookData()
	{
		Book b=new Book(1,"ramm",2500.00);
		return b;
	}
}
