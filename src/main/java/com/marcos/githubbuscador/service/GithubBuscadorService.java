package com.marcos.githubbuscador.service;

import com.marcos.githubbuscador.dto.GithubUser;
import com.marcos.githubbuscador.dto.RepositorySummary;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface GithubBuscadorService {
    List<RepositorySummary> listReposByUser(GithubUser githubUser) throws IOException;
}
