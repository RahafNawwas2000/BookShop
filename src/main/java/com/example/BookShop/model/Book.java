package com.example.BookShop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE)
    int id;
    String isbn;
    String name;
    @ManyToOne
    author Author;


    public Book() {
    }

    public Book(int id, String isbn, String name) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;

    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", name='" + name + '\'' +

                '}';
    }
}
