package com.book_store.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book_store.entity.My_Book_List;
import com.book_store.repository.My_Book_Repository;



@Service
public class My_Book_Service {
	
	@Autowired
	private My_Book_Repository mybook;
	
	public void saveMyBooks(My_Book_List book) {
		mybook.save(book);
	}
	
	public List<My_Book_List> getAllMyBooks(){
		return mybook.findAll();
	}
	
	public void deleteById(int id) {
		mybook.deleteById(id);
	}
}