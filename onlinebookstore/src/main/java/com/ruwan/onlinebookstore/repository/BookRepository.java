package com.ruwan.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruwan.onlinebookstore.entity.BookCategory;

public interface BookRepository extends JpaRepository<BookCategory, Long> {

}
