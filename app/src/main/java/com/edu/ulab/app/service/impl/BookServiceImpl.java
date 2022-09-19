package com.edu.ulab.app.service.impl;

import com.edu.ulab.app.dto.BookDto;
import com.edu.ulab.app.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;



@Slf4j
@Service
public class BookServiceImpl implements BookService {

    private static long bookId;

    @Override
    public BookDto createBook(BookDto bookDto) {

        return null;
    }

    @Override
    public BookDto updateBook(BookDto bookDto) {

        return bookDto;
    }

    @Override
    public BookDto getBookById(Long id) {
        return null;
    }

    @Override
    public void deleteBookById(Long id) {



    }
}