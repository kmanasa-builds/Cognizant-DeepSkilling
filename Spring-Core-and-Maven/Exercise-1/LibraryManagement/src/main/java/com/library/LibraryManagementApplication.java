package com.library;

import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService =
                context.getBean("bookService", BookService.class);

        BookRepository bookRepository =
                context.getBean("bookRepository", BookRepository.class);

        bookService.displayService();
        bookRepository.displayRepository();

        System.out.println("Spring IoC Container Loaded Successfully.");
    }
}