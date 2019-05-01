package com.vasit.uaa.web.rest;


import com.vasit.uaa.service.BookService;
import com.vasit.uaa.service.dto.BookDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class BookResource {
    private final Logger log = LoggerFactory.getLogger(BookResource.class);

    private final BookService bookService;

    public BookResource(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookDTO> getBooks() {
        return bookService.all();
    }
}
