package com.example.instagramclone.api

import retrofit2.Call
import retrofit2.http.GET

interface InstagramApi {
    @GET("post/all")
    fun getAllPosts(): Call<List<Post>>
}