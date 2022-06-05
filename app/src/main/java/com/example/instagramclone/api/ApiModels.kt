package com.example.instagramclone.api

import com.google.gson.annotations.SerializedName

data class Post(
    val id: Int,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("image_url_type") val imageUrlType: String,
    val caption: String,
    val timestamp: String,
    val user: PostUser,
    val comment: List<Comment>
)

data class PostUser(
    val username: String
)

data class Comment(
    val text: String,
    val username: String,
    val timestamp: String
)
