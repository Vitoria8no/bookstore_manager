package com.jessicasilva.bookstoremanager.repository;

import com.jessicasilva.bookstoremanager.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Book;

public interface BookRepository extends JpaRepository<Book,Long> {




}
