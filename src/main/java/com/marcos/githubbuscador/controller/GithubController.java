package com.marcos.githubbuscador.controller;

import com.marcos.githubbuscador.dto.GithubUser;
import com.marcos.githubbuscador.dto.RepositorySummary;
import com.marcos.githubbuscador.service.GithubBuscadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/")
public class GithubController {

    @Autowired
    private GithubBuscadorService githubBuscadorService;

    @PostMapping(value = "/list", consumes = "application/json", produces = "*/*")
    public ResponseEntity<List<RepositorySummary>> indexUsingPOST(@RequestBody GithubUser user) throws IOException {
        List<RepositorySummary> repositorySummary = githubBuscadorService.listReposByUser(user);
        return null;
    }
}
