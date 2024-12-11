package com.book_store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book_store.entity.My_Book_List;
@Repository
public interface My_Book_Repository extends JpaRepository<My_Book_List, Integer> {

}
