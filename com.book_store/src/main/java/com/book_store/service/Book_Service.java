package com.book_store.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.book_store.entity.Books;
import com.book_store.repository.Book_Repository;

@Service
public class Book_Service {
	
	@Autowired
	private Book_Repository bRepo;
	
	public void save(Books b) {
		bRepo.save(b);
	}
	
	public List<Books> getAllBook(){
		return bRepo.findAll();
	}
	
	public Books getBookById(int id) {
		return bRepo.findById(id).get();
	}
	public void deleteById(int id) {
		bRepo.deleteById(id);
	}
}