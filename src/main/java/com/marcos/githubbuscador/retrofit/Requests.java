package com.marcos.githubbuscador.retrofit;

import com.marcos.githubbuscador.dto.RepositorySummary;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import java.util.List;

public interface Requests {
    @GET("/user/repos")
    Call<List<RepositorySummary>> listRepositories(@Header("Authorization") String authHeader, @Header("Accept") String type);
}
