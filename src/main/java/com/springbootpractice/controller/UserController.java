package com.springbootpractice.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "/user")
    public String read() {
        return "Hello User!";
    }

    @PostMapping(value = "/user")
    public ResponseEntity<Void> create() {
        return ResponseEntity.created(URI.create("URI-location")).build();
    }
}
