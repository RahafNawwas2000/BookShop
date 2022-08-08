package com.example.BookShop.JPA;

import com.example.BookShop.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookJPA extends CrudRepository<Book, Integer> {
}
