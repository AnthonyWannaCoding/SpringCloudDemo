package com.example.service.client;

import com.example.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookFallbackClient implements BookClient{
    @Override
    public Book findBookById(int bid) {
        return new Book();
    }
}
