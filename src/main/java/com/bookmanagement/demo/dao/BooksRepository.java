package com.bookmanagement.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bookmanagement.demo.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
