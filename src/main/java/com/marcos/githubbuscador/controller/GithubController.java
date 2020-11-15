package com.marcos.githubbuscador.controller;

import com.marcos.githubbuscador.dto.RepositorySummary;
import com.marcos.githubbuscador.service.GithubBuscadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GithubController {

//    @Autowired
//    private GithubBuscadorService githubBuscadorService;

    @GetMapping(value = "/list", consumes = "application/json", produces = "*/*")
    public ResponseEntity indexUsingPOST(){
        //epositorySummary repositorySummary = githubBuscadorService
        return null;
    }
}
