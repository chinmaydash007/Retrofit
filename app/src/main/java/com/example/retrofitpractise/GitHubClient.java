package com.example.retrofitpractise;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubClient {
    @GET("/users/{user}/repo")
    Call<List<GitHubRepo>> reposForUser(@Path("user") String user);

}
