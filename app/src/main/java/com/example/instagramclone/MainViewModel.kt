package com.example.instagramclone

import androidx.lifecycle.ViewModel
import com.example.instagramclone.api.InstagramApiService
import com.example.instagramclone.api.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel: ViewModel() {

    init {
//        getAllPosts()
    }

    fun getAllPosts() {
        InstagramApiService.api
            .getAllPosts()
            .enqueue(object : Callback<List<Post>> {
                override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                    if (response.isSuccessful) {
                        val list = response.body()
                    }
                }

                override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                    val i = 0
                }

            })
    }
}