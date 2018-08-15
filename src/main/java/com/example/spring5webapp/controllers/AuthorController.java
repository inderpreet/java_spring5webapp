package com.example.spring5webapp.controllers;

import com.example.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// Testing code for JPA and Hibernate. Controller for MVC like app.
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        model.addAttribute("tester", "This is a test String hardcoded into the controller class");
        return "authors";
    }
}
