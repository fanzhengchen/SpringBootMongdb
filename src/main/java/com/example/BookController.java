package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fanzhengchen on 2/10/16.
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Book getBook() {
        Book book = new Book();
        book.setName("ww");
        return book;
    }
}
