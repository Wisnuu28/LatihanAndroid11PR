package com.example.latihanandroid11pr.model

data class MovieResponse(var page : Int,
                         val results : ArrayList<Movie>,
                         val totalResult : Int,
                         val totalPage : Int)