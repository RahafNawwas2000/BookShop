package com.example.BookShop.component;

import com.example.BookShop.JPA.BookJPA;
import com.example.BookShop.model.Book;
import com.example.BookShop.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookComponent {
    @Autowired
    BookJPA BOOK_JPA;
    public void CreateBook(int AuthorID,Book book) {

    }

    public Book GetBook(int id)
    {
        return null;
    }

    public List<Book> GetAllBooks()
    {
        return null;
    }
    public List<Book> GetBookByAuthorID(int id)
    {
        return null;
    }

}
