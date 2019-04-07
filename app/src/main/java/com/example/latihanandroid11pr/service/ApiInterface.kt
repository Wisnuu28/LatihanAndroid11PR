package com.example.latihanandroid11pr.service

import com.example.latihanandroid11pr.model.Movie
import com.example.latihanandroid11pr.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("movie/latest")
    fun getMovieLatest (@Query("api_key") apiKey : String) : Call<Movie>
    @GET("movie/popular")
    fun getPopularMovie(@Query("api_key") apiKey : String) : Call<MovieResponse>
}