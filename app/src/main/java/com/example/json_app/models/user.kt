package com.example.json_app

import com.example.myappemp.json_app.address

data class user(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val address: address)