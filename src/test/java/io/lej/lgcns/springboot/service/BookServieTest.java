package io.lej.lgcns.springboot.service;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import io.lej.lgcns.springboot.domain.Book;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.NONE)
public class BookServieTest {

	@Autowired
	BookServie bookServie;
	
	@Test(expected=RuntimeException.class)
	public void testFindById() {
		Long id = 1L;
		bookServie.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
		
	}
}
