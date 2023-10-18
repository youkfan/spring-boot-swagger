package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Person;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/get/{id}")
    public Person getPersionById(
        @PathVariable String id) {
        return new Person();
    }
}
