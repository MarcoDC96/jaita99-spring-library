package org.learning.springlibrary.controller;

import org.learning.springlibrary.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public  String index(Model model) {
        List<Book> bookList = new ArrayList<>();
        model.addAttribute("bookList", bookList);
        return "books/list";
    }
}
