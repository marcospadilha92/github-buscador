package com.marcos.githubbuscador.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GithubController {

    @GetMapping(value = "/list", consumes = "application/json", produces = "*/*")
    public ResponseEntity indexUsingPOST(){
        return null;
    }
}
