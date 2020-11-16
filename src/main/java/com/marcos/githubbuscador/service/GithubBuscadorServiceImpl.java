package com.marcos.githubbuscador.service;

import com.marcos.githubbuscador.dto.GithubUser;
import com.marcos.githubbuscador.dto.RepositorySummary;
import com.marcos.githubbuscador.retrofit.RetrofitFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Base64;
import java.util.List;

@Service
public class GithubBuscadorServiceImpl implements GithubBuscadorService {
    @Value("${git.url}")
    private String gitUrlBase;

    @Override
    public List<RepositorySummary> listReposByUser(GithubUser githubUser) throws IOException {
        String auth = githubUser.getUsername() + ":" + githubUser.getPassword();
        byte[] encodedAuth = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic " + new String(encodedAuth);

        var retrofit = RetrofitFactory.getRequests(gitUrlBase);
        var response = retrofit.listRepositories(authHeader, MediaType.APPLICATION_JSON_VALUE).execute();
        return response.body();
    }
}
