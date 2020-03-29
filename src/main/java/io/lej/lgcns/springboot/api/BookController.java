package io.lej.lgcns.springboot.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import io.lej.lgcns.springboot.domain.Book;
import io.lej.lgcns.springboot.service.BookServie;

import org.springframework.web.bind.annotation.PathVariable; 


@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookServie bookService; 
	
	@GetMapping("/{bookId}")
	public ResponseEntity<Book> findById(@PathVariable Long bookId) {
		Book book = bookService.findById(bookId)
				.orElseThrow(()-> new RuntimeException("Not found : "));
		
		return ResponseEntity.ok(book);
	}
}
