package com.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book_store.entity.Books;

@Repository
public interface Book_Repository extends JpaRepository<Books, Integer> {

}
