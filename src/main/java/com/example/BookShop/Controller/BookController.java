package com.example.BookShop.Controller;

import com.example.BookShop.component.BookComponent;
import com.example.BookShop.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookComponent bookComp;

    @RequestMapping(method = RequestMethod.POST,value ="Author/{AuthorID}/CreateBook" )
    public void CreateBook(@PathVariable int AuthorID, @RequestBody Book book)
    {
        bookComp.CreateBook(AuthorID,book);
    }
    @RequestMapping(value = "/Books")
    public List<Book> GetBooks()
    {
        return bookComp.GetAllBooks();
    }
    @RequestMapping(value = "/Authors/{id}/Books")
    public List<Book> GetBooksByAuthorId(int id)
    {
        return bookComp.GetBookByAuthorID(id);
    }
    @RequestMapping(value = "/Authors/{id}/Books/{BookID}")
    public Book GetBookByID(int BookID)
    {
        return bookComp.GetBook(BookID);
    }

}
