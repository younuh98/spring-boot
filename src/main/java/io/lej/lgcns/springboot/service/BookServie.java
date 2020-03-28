package io.lej.lgcns.springboot.service;

import java.util.Optional;

import io.lej.lgcns.springboot.domain.Book;

public interface BookServie {

	Optional<Book> findById(Long id);
}
