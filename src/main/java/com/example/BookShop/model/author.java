package com.example.BookShop.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class author {
    @Id
    int id;
    String name;


    public author() {
    }

    public author(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "author{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
