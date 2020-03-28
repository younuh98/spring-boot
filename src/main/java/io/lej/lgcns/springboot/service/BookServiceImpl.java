package io.lej.lgcns.springboot.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import io.lej.lgcns.springboot.domain.Book;
import io.lej.lgcns.springboot.domain.BookRepository;

@Service
@Transactional
public class BookServiceImpl implements BookServie {

	private final BookRepository bookRepository; 
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		//super();
		this.bookRepository = bookRepository;
	}


	@Override
	public Optional<Book> findById(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id);
	}

}
