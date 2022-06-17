package com.example.json_app.services

import com.example.json_app.user
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface UsersService {
    @GET("/users/{id}")
    fun getUser(@Path("id") id: String): Call<user>
}


